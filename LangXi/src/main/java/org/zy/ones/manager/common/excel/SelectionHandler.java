package org.zy.ones.manager.common.excel;

import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.data.WriteCellData;
import com.alibaba.excel.write.handler.CellWriteHandler;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteTableHolder;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddressList;

import java.util.Arrays;
import java.util.List;

/**
 * @author xiangtw
 * @date 2021年12月27日 10:48
 * description:
 */
@Slf4j
public class SelectionHandler implements CellWriteHandler {

    @Override
    public void afterCellDispose(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, List<WriteCellData<?>> cellDataList, Cell cell, Head head, Integer relativeRowIndex, Boolean isHead) {
        if(isHead){
            Sheet sheet = writeSheetHolder.getSheet();
            DictConverter d = head.getField().getAnnotation(DictConverter.class);
            if(d!=null){
                String [] datas = Arrays.stream(d.value()).map(item ->item.substring(item.indexOf(":")+1)).toArray(String[]::new);
                DataValidationHelper dvHelper = sheet.getDataValidationHelper();
                DataValidationConstraint dvConstraint = dvHelper
                        .createExplicitListConstraint(datas);
                CellRangeAddressList addressList = null;
                DataValidation validation = null;
                for (int i = 1; i < 1000; i++) {
                    addressList = new CellRangeAddressList(i, i, cell.getColumnIndex(), cell.getColumnIndex());
                    validation = dvHelper.createValidation(
                            dvConstraint, addressList);
                    sheet.addValidationData(validation);
                }
            }
        }
    }
}
