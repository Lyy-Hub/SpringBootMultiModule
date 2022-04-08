package org.robin.ones.gasmanager.common.excel;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.data.ReadCellData;
import com.alibaba.excel.metadata.data.WriteCellData;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

import java.util.HashMap;
import java.util.Map;


/**
 * @author xiangtw
 * @date 2021年12月23日 14:27
 * description:
 */
public class ExcelDictConverter implements Converter<Integer> {

    @Override
    public Class<?> supportJavaTypeKey() {
        return Integer.class;
    }

    @Override
    public CellDataTypeEnum supportExcelTypeKey() {
        return CellDataTypeEnum.STRING;
    }

    @Override
    public Integer convertToJavaData(ReadCellData<?> cellData, ExcelContentProperty contentProperty, GlobalConfiguration globalConfiguration) throws Exception {
        String value = cellData.getStringValue();
        if(value!=null){
            String [] trs = contentProperty.getField().getAnnotation(DictConverter.class).value();
            return toValueKey(trs).get(value);
        }else{
            return null;
        }
    }

    @Override
    public WriteCellData<?> convertToExcelData(Integer value, ExcelContentProperty contentProperty, GlobalConfiguration globalConfiguration) throws Exception {
        if(value!=null){
            String [] trs= contentProperty.getField().getAnnotation(DictConverter.class).value();
            String cellValue = toKeyValue(trs).get(value);
            if(cellValue!=null){
                return new WriteCellData(toKeyValue(trs).get(value));
            }
        }
        return new WriteCellData(String.valueOf(value));

    }

    private Map<Integer,String> toKeyValue(String [] trs){
        Map<Integer,String> map = new HashMap<>();
        for (String tr:trs){
            String[] ss = tr.split(":");
            if(ss.length>=2){
                map.put(Integer.parseInt(ss[0]),ss[1]);
            }
        }
        return map;
    }

    private Map<String,Integer> toValueKey(String [] trs){
        Map<String,Integer> map = new HashMap<>();
        for (String tr:trs){
            String[] ss = tr.split(":");
            if(ss.length>=2){
                map.put(ss[1],Integer.parseInt(ss[0]));
            }
        }
        return map;
    }

}
