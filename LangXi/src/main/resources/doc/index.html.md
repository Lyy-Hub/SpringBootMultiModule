# gas-manager-doc
Version |  Update Time  | Status | Author |  Description
---|---|---|---|---
v2022-02-15 16:29:56|2022-02-15 16:29:56|auto|@LiYueYang|Created by smart-doc



## 气瓶充后检查记录管理
### 充后检查记录
**URL:** http://localhost:8080/rest/gasAfterFillingRec/{czjlId}

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 充后检查记录

**Path-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
czjlId|string|充装记录Id|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8080/rest/gasAfterFillingRec/97
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
id|string|ID|-
gpid|string|钢瓶ID|-
czdw|string|充装站点|-
czy|string|充装员|-
jcy|string|检查员|-
jcsj|string|检查时间|-
xcjcsj|string|下次检查时间|-
jielun|number|j结论是否合格|-
ptsfhg|number|瓶体是否合格|-
hzqs|number|护罩是否缺损|-
dzqs|number|底座是否缺损|-
pfqs|number|瓶阀是否缺损|-
hpqs|number|号牌是否缺损|-
wgqs|number|外观是否缺损|-
qpxl|number|制造信息是否清晰|-
sfgb|number|是否有效期内|-
ptwd|number|是否有检查标志|-
sfztjsbq|number|是否有制造许可证|-
czlsfhg|number|是否进口气瓶|-
kpz|string|充装介质是否一致|-
czl|string|警示标签是否合格|-
clfc|string|是否自有产权气瓶|-
wc|string|颜色是否合格|-
bz|string|备注|-

**Response-example:**
```
[
  {
    "id": "97",
    "gpid": "97",
    "czdw": "ul26ke",
    "czy": "hk3hob",
    "jcy": "ai2uhi",
    "jcsj": "2022-02-15 16:30:01",
    "xcjcsj": "2022-02-15 16:30:01",
    "jielun": 85,
    "ptsfhg": 861,
    "hzqs": 72,
    "dzqs": 728,
    "pfqs": 233,
    "hpqs": 681,
    "wgqs": 103,
    "qpxl": 788,
    "sfgb": 701,
    "ptwd": 700,
    "sfztjsbq": 606,
    "czlsfhg": 245,
    "kpz": "m7pqj3",
    "czl": "dz3qih",
    "clfc": "bell90",
    "wc": "570n8e",
    "bz": "tstz0c"
  }
]
```

## 气瓶充前检查记录管理
### 充前检查记录
**URL:** http://localhost:8080/rest/gasBeforeFillingRec/{czjlId}

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 充前检查记录

**Path-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
czjlId|string|充装记录Id|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8080/rest/gasBeforeFillingRec/97
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
id|string|ID|-
gpid|string|钢瓶ID|-
czdw|string|充装站点|-
jcy|string|检查员|-
jcsj|string|检查时间|-
xcjcsj|string|下次检查时间|-
jielun|number|j结论是否合格|-
ptsfhg|number|瓶体是否合格|-
hzqs|number|护罩是否缺损|-
dzqs|number|底座是否缺损|-
pfqs|number|瓶阀是否缺损|-
hpqs|number|号牌是否缺损|-
wgqs|number|外观是否缺损|-
zzxxsfqx|number|制造信息是否清晰|-
yxqn|number|是否有效期内|-
yjcbz|number|是否有检查标志|-
zzxkz|number|是否有制造许可证|-
jkqp|number|是否进口气瓶|-
czjzsfyz|number|充装介质是否一致|-
jsbqsfhg|number|警示标签是否合格|-
zycqqp|number|是否自有产权气瓶|-
yssfhg|number|颜色是否合格|-
lwxsfh|number|螺纹型式是否符合|-
sfyyy|number|是否有余压|-
aqfjqq|number|安全附件是否齐全|-
bz|number|备注|-

**Response-example:**
```
[
  {
    "id": "97",
    "gpid": "97",
    "czdw": "a3q52a",
    "jcy": "jdl8xh",
    "jcsj": "2022-02-15 16:30:01",
    "xcjcsj": "2022-02-15 16:30:01",
    "jielun": 380,
    "ptsfhg": 613,
    "hzqs": 328,
    "dzqs": 855,
    "pfqs": 396,
    "hpqs": 863,
    "wgqs": 151,
    "zzxxsfqx": 378,
    "yxqn": 61,
    "yjcbz": 643,
    "zzxkz": 189,
    "jkqp": 429,
    "czjzsfyz": 570,
    "jsbqsfhg": 723,
    "zycqqp": 146,
    "yssfhg": 663,
    "lwxsfh": 508,
    "sfyyy": 303,
    "aqfjqq": 676,
    "bz": 290
  }
]
```

## 气瓶充装记录管理
### 充装记录
**URL:** http://localhost:8080/rest/gasFillingRecord/getGasFillingRecordList

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 充装记录

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
pageNum|int32| 页码|false|-
pageSize|int32|每页条数|false|-
gpid|string|    钢瓶 ID|false|-
czdw|string|    充装单位|false|-
czkssj|string|  充装开始时间|false|-
czjssj|string|  充装结束时间|false|-
czjz|string|    充装介质|false|-
czy|string|     充装员|false|-
jcy|string|     检查员|false|-

**Request-example:**
```
curl -X GET -i http://localhost:8080/rest/gasFillingRecord/getGasFillingRecordList?czkssj=zewb35&jcy=96ykj6&czjssj=xj9zbp&czy=82cdjy&pageSize=20&czdw=i76tsp&pageNum=1&gpid=97&czjz=m9v71t
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
searchCount|boolean|是否进行 count 查询|-
pages|int64|当前分页总页数|-
hitCount|boolean|是否命中count缓存|-
records|array|查询数据列表|-
└─id|string|ID|-
└─gpid|string|钢瓶ID|-
└─czdw|string|充装单位|-
└─czsj|string|充装时间|-
└─gpgg|string|钢瓶规格|-
└─czgg|string|充装规格|-
└─czjz|string|充装介质|-
└─czy|string|充装员|-
└─jcy|string|检查员|-
└─czqh|string|充装枪号|-
└─ftbm|string|阀体编码|-
└─czcs|string|充装次数|-
└─scczsj|string|上次充装时间|-
└─bz|string|备注|-
└─gpbm|string|钢瓶编码|-
└─xcjyrq|string|下次检验日期|-
└─zdmc|string|站点(充装单位)名称|-
total|int64|总数|-
size|int64|每页显示条数，默认 10|-
current|int64|当前页|-
orders|array|排序字段信息|-
└─column|string|需要进行排序的字段|-
└─asc|boolean|是否正序排列，默认 true|-
optimizeCountSql|boolean|自动优化 COUNT SQL|-
countId|string|countId|-
maxLimit|int64|countId|-

**Response-example:**
```
{
  "searchCount": true,
  "pages": 169,
  "hitCount": true,
  "records": [
    {
      "id": "97",
      "gpid": "97",
      "czdw": "8f0xuz",
      "czsj": {},
      "gpgg": "mpq61j",
      "czgg": "sn9bnc",
      "czjz": "cnen0j",
      "czy": "bwpskx",
      "jcy": "h69nk4",
      "czqh": "su5yql",
      "ftbm": "y7q3gh",
      "czcs": "n6mb76",
      "scczsj": {},
      "bz": "ohuqdj",
      "gpbm": "esyss7",
      "xcjyrq": {},
      "zdmc": "uutjqn"
    }
  ],
  "total": 675,
  "size": 694,
  "current": 108,
  "orders": [
    {
      "column": "ecu6lv",
      "asc": true
    }
  ],
  "optimizeCountSql": true,
  "countId": "97",
  "maxLimit": 539
}
```

## 首页大屏数据统计
### 统计数据
**URL:** http://localhost:8080/rest/home/getDataStatistics

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 统计数据

**Request-example:**
```
curl -X GET -i http://localhost:8080/rest/home/getDataStatistics
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
typeName|string|分类名称|-
counts|int32|数量|-

**Response-example:**
```
[
  {
    "typeName": "cary.ledner",
    "counts": 453
  }
]
```

### 区县统计 - 气瓶数
**URL:** http://localhost:8080/rest/home/getDistrictAndCountyStatistics

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 区县统计 - 气瓶数

**Request-example:**
```
curl -X GET -i http://localhost:8080/rest/home/getDistrictAndCountyStatistics
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
xqName|string|县区名称|-
counts|int32|气瓶数量|-

**Response-example:**
```
[
  {
    "xqName": "cary.ledner",
    "counts": 221
  }
]
```

### 气瓶种类统计
**URL:** http://localhost:8080/rest/home/getCylinderTypeStatistics

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 气瓶种类统计

**Request-example:**
```
curl -X GET -i http://localhost:8080/rest/home/getCylinderTypeStatistics
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
qpzl|object|气瓶种类：<br>1-液化石油气钢瓶<br>2-无缝气瓶<br>3-溶解乙炔气瓶<br>4-焊接气瓶<br>5-车用气瓶<br>6-低温绝热气瓶<br>7-铝合金无缝气瓶<br>8-液化二甲醚钢瓶<br>9-液化石油气纤维缠绕气瓶<br>10-钢制无缝气瓶<br>11-不锈钢无缝气瓶<br>12-钢制焊接气瓶<br>13-工业气瓶|-
└─any object|object|any object.|-
counts|int32|数量|-

**Response-example:**
```
[
  {
    "qpzl": {
      "object": "any object"
    },
    "counts": 880
  }
]
```

### 地图标注 - 气站数
**URL:** http://localhost:8080/rest/home/getMapMarkStatistics

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 地图标注 - 气站数

**Request-example:**
```
curl -X GET -i http://localhost:8080/rest/home/getMapMarkStatistics
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
xqName|string|县区名称|-
counts|int32|气站数量|-

**Response-example:**
```
[
  {
    "xqName": "cary.ledner",
    "counts": 172
  }
]
```

### 充装记录 - 前20条
**URL:** http://localhost:8080/rest/home/getFillingRecordStatistics

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 充装记录 - 前20条

**Request-example:**
```
curl -X GET -i http://localhost:8080/rest/home/getFillingRecordStatistics
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
id|string|ID|-
gpid|string|钢瓶ID|-
czdw|string|充装单位|-
czsj|string|充装时间|-
gpgg|string|钢瓶规格|-
czgg|string|充装规格|-
czjz|string|充装介质|-
czy|string|充装员|-
jcy|string|检查员|-
czqh|string|充装枪号|-
ftbm|string|阀体编码|-
czcs|string|充装次数|-
scczsj|string|上次充装时间|-
bz|string|备注|-
gpbm|string|钢瓶编码|-
xcjyrq|string|下次检验日期|-
zdmc|string|站点(充装单位)名称|-

**Response-example:**
```
[
  {
    "id": "97",
    "gpid": "97",
    "czdw": "1tx3jt",
    "czsj": {},
    "gpgg": "ktiduo",
    "czgg": "7gqmzn",
    "czjz": "t0uulz",
    "czy": "q53z1d",
    "jcy": "2iat7i",
    "czqh": "6qgvoy",
    "ftbm": "dm84ba",
    "czcs": "a6qk95",
    "scczsj": {},
    "bz": "ho7mk4",
    "gpbm": "saptb3",
    "xcjyrq": {},
    "zdmc": "fl2j5q"
  }
]
```

### 实时数据统计 - 当月每天充装数
**URL:** http://localhost:8080/rest/home/getRealTimeStatistics

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 实时数据统计 - 当月每天充装数

**Request-example:**
```
curl -X GET -i http://localhost:8080/rest/home/getRealTimeStatistics
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
data|string|日期|-
counts|int32|数量|-

**Response-example:**
```
[
  {
    "data": "x5xgrb",
    "counts": 956
  }
]
```

### 充装次数统计
**URL:** http://localhost:8080/rest/home/getFillingCountStatistics

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 充装次数统计

**Request-example:**
```
curl -X GET -i http://localhost:8080/rest/home/getFillingCountStatistics
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
deviceTotal|int32|设备总数|-
dwczcs|array|单位充装次数|-
└─dwName|string|单位名称|-
└─counts|int32|数量|-

**Response-example:**
```
[
  {
    "deviceTotal": 506,
    "dwczcs": [
      {
        "dwName": "cary.ledner",
        "counts": 278
      }
    ]
  }
]
```

### 气瓶年限统计
**URL:** http://localhost:8080/rest/home/getCylinderYearsStatistics

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 气瓶年限统计

**Request-example:**
```
curl -X GET -i http://localhost:8080/rest/home/getCylinderYearsStatistics
```

**Response-example:**
```
{
  "mapKey1": 531,
  "mapKey2": 527
}
```

## 入户安检记录管理
### 入户安检查询
**URL:** http://localhost:8080/rest/gasHouseHoldCheck/getGasLpgCustomerList

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 入户安检查询

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
pageNum|int32| 页码|false|-
pageSize|int32|每页条数|false|-
hzmc|string|    户主名称|false|-
jckssj|string|  检查开始时间|false|-
jcjssj|string|  检查结束时间|false|-

**Request-example:**
```
curl -X GET -i http://localhost:8080/rest/gasHouseHoldCheck/getGasLpgCustomerList?pageSize=20&jckssj=o7rz36&hzmc=y7kp3t&jcjssj=9pdpb6&pageNum=1
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
searchCount|boolean|是否进行 count 查询|-
pages|int64|当前分页总页数|-
hitCount|boolean|是否命中count缓存|-
records|array|查询数据列表|-
└─id|string|ID|-
└─hzmc|string|户主名称|-
└─yhid|string|用户ID|-
└─hzdh|string|户主电话|-
└─hzdz|string|户主地址|-
└─gpid|string|钢瓶ID|-
└─jcsj|string|检查时间|-
└─jcr|string|检测人|-
└─jczp|string|检测照片|-
└─jcqm|string|检测签名|-
└─jyf|number|减压阀是否合格|-
└─tongfeng|number|通风是否合格|-
└─zaoju|number|灶具是否合格|-
└─azwz|number|安装位置是否合格|-
└─jiaoguan|number|胶管是否合格|-
└─sfdjqy|number|是否多家气源|-
└─yxqn|number|是否有效期内|-
└─jcbz|number|是否有检查标志|-
└─gangping|number|钢瓶是否合格|-
└─jielun|number|结论是否合格|-
└─bz|string|备注|-
total|int64|总数|-
size|int64|每页显示条数，默认 10|-
current|int64|当前页|-
orders|array|排序字段信息|-
└─column|string|需要进行排序的字段|-
└─asc|boolean|是否正序排列，默认 true|-
optimizeCountSql|boolean|自动优化 COUNT SQL|-
countId|string|countId|-
maxLimit|int64|countId|-

**Response-example:**
```
{
  "searchCount": true,
  "pages": 498,
  "hitCount": true,
  "records": [
    {
      "id": "97",
      "hzmc": "oy2806",
      "yhid": "97",
      "hzdh": "ezkp9u",
      "hzdz": "67vksv",
      "gpid": "97",
      "jcsj": "2022-02-15 16:30:02",
      "jcr": "4yqprr",
      "jczp": "wndfxz",
      "jcqm": "l4gcno",
      "jyf": 406,
      "tongfeng": 203,
      "zaoju": 939,
      "azwz": 784,
      "jiaoguan": 57,
      "sfdjqy": 882,
      "yxqn": 904,
      "jcbz": 209,
      "gangping": 582,
      "jielun": 708,
      "bz": "9pxgj4"
    }
  ],
  "total": 326,
  "size": 152,
  "current": 623,
  "orders": [
    {
      "column": "hm00wf",
      "asc": true
    }
  ],
  "optimizeCountSql": true,
  "countId": "97",
  "maxLimit": 541
}
```

## 液化气瓶用户管理
### 用户查询
**URL:** http://localhost:8080/rest/gasLpgCustomer/getGasLpgCustomerList

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 用户查询

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
pageNum|int32| 页码|false|-
pageSize|int32|每页条数|false|-
xm|string|      姓名|false|-
lxdh|string|    联系电话|false|-

**Request-example:**
```
curl -X GET -i http://localhost:8080/rest/gasLpgCustomer/getGasLpgCustomerList?lxdh=ha0hlw&xm=f5yym4&pageNum=1&pageSize=20
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
searchCount|boolean|是否进行 count 查询|-
pages|int64|当前分页总页数|-
hitCount|boolean|是否命中count缓存|-
records|array|查询数据列表|-
└─id|string|ID|-
└─xm|string|姓名|-
└─yhzh|string|用户账号|-
└─xb|string|性别|-
└─lxdh|string|联系电话|-
└─jtzz|string|家庭住址|-
└─szqh|string|所在区划|-
└─sfzhm|string|身份证号码|-
└─khsj|string|开户时间|-
└─bz|string|备注|-
total|int64|总数|-
size|int64|每页显示条数，默认 10|-
current|int64|当前页|-
orders|array|排序字段信息|-
└─column|string|需要进行排序的字段|-
└─asc|boolean|是否正序排列，默认 true|-
optimizeCountSql|boolean|自动优化 COUNT SQL|-
countId|string|countId|-
maxLimit|int64|countId|-

**Response-example:**
```
{
  "searchCount": true,
  "pages": 575,
  "hitCount": true,
  "records": [
    {
      "id": "97",
      "xm": "88uytd",
      "yhzh": "qhllcy",
      "xb": "52n46m",
      "lxdh": "p9obxh",
      "jtzz": "vp0yr4",
      "szqh": "s5kslp",
      "sfzhm": "63m64u",
      "khsj": {},
      "bz": "xrkk7d"
    }
  ],
  "total": 881,
  "size": 814,
  "current": 973,
  "orders": [
    {
      "column": "1lqjpb",
      "asc": true
    }
  ],
  "optimizeCountSql": true,
  "countId": "97",
  "maxLimit": 697
}
```

## 液化气瓶基础信息管理
### 气瓶查询
**URL:** http://localhost:8080/rest/gasLpgcyLinder/getGasLpgcyLinderList

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 气瓶查询

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
pageNum|int32| 页码|false|-
pageSize|int32|每页条数|false|-
gpbm|string|    钢瓶编码|false|-
gpgg|string|    钢瓶规格|false|-
ssdwid|string|  所属单位 ID|false|-
sccj|string|    生产厂家|false|-
bcjyksrq|string|  本次检验开始日期|false|-
bcjyjsrq|string|  本次检验结束日期|false|-
zzsykssj|string|  终止使用开始时间|false|-
zzsyjssj|string|  终止使用结束时间|false|-
jydw|string|    检验单位|false|-
qpzl|string|    气瓶种类|false|-
qpzt|string|    气瓶状态|false|-

**Request-example:**
```
curl -X GET -i http://localhost:8080/rest/gasLpgcyLinder/getGasLpgcyLinderList?zzsyjssj=21s37l&qpzl=et1cnf&pageSize=20&sccj=waofy9&qpzt=6b4gsv&pageNum=1&gpgg=6d2ugv&ssdwid=97&bcjyjsrq=oi6mkh&bcjyksrq=xj3qsu&zzsykssj=zkcavp&jydw=fiiio9&gpbm=yhson0
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
searchCount|boolean|是否进行 count 查询|-
pages|int64|当前分页总页数|-
hitCount|boolean|是否命中count缓存|-
records|array|查询数据列表|-
└─id|string|ID|-
└─gpbm|string|钢瓶编码|-
└─ftbm|string|阀体编码|-
└─czgg|string|充装规格|-
└─gpgg|string|钢瓶规格|-
└─czjz|string|充装介质|-
└─gpzp|string|钢瓶照片|-
└─scrq|string|生产日期|-
└─sccj|string|生产厂家|-
└─ssdwid|string|所属单位ID|-
└─bcjyrq|string|本次检验日期|-
└─xcjyrq|string|下次检验日期|-
└─djsj|string|定检时间|-
└─jzsysj|string|截至使用时间|-
└─zzsysj|string|终止使用时间|-
└─jydw|string|检验单位|-
└─qpzl|string|气瓶种类|-
└─qpzt|string|气瓶状态|-
└─tbsj|string|投保时间|-
└─tbht|string|投保合同|-
└─djbm|string|登记编码|-
└─zzxkz|string|制造许可证|-
└─pz|string|瓶重|-
└─bh|string|壁厚|-
└─gcyl|string|公称压力MPa|-
└─bz|string|备注|-
total|int64|总数|-
size|int64|每页显示条数，默认 10|-
current|int64|当前页|-
orders|array|排序字段信息|-
└─column|string|需要进行排序的字段|-
└─asc|boolean|是否正序排列，默认 true|-
optimizeCountSql|boolean|自动优化 COUNT SQL|-
countId|string|countId|-
maxLimit|int64|countId|-

**Response-example:**
```
{
  "searchCount": true,
  "pages": 448,
  "hitCount": true,
  "records": [
    {
      "id": "97",
      "gpbm": "49xdtx",
      "ftbm": "dmlv0j",
      "czgg": "cp9aql",
      "gpgg": "6pl1yv",
      "czjz": "hntudg",
      "gpzp": "cp2fo0",
      "scrq": {},
      "sccj": "c9uy56",
      "ssdwid": "97",
      "bcjyrq": {},
      "xcjyrq": {},
      "djsj": {},
      "jzsysj": {},
      "zzsysj": {},
      "jydw": "vbbzys",
      "qpzl": "a8f9n2",
      "qpzt": "llczo5",
      "tbsj": {},
      "tbht": "jdvn3s",
      "djbm": "oxa76z",
      "zzxkz": "h726ak",
      "pz": "b7w5cc",
      "bh": "uvzqhq",
      "gcyl": "zx4k78",
      "bz": "6yu4rk"
    }
  ],
  "total": 266,
  "size": 727,
  "current": 378,
  "orders": [
    {
      "column": "tb0pxc",
      "asc": true
    }
  ],
  "optimizeCountSql": true,
  "countId": "97",
  "maxLimit": 990
}
```

## 液化气瓶流转管理
### 流转记录
**URL:** http://localhost:8080/rest/gasLpgTransfer/getGasLpgTransferList

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 流转记录

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
pageNum|int32| 页码|false|-
pageSize|int32|每页条数|false|-
gpid|string|    钢瓶 ID|false|-
zt|string|      状态（重瓶/新瓶/使用中）|false|-
lzkssj|string|  流转开始时间|false|-
lzjssj|string|  流转结束时间|false|-
sfyc|int32|    是否异常(0:否 1：是)|false|-
dqwzid|string|  当前位置|false|-

**Request-example:**
```
curl -X GET -i http://localhost:8080/rest/gasLpgTransfer/getGasLpgTransferList?pageSize=20&lzjssj=8xw9ez&lzkssj=dtsf2g&dqwzid=97&gpid=97&zt=8ysrcl&pageNum=1&sfyc=0
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
searchCount|boolean|是否进行 count 查询|-
pages|int64|当前分页总页数|-
hitCount|boolean|是否命中count缓存|-
records|array|查询数据列表|-
└─id|string|ID|-
└─gpid|string|钢瓶id|-
└─ftbm|string|阀体编码|-
└─zt|string|状态（重瓶/新瓶/使用中）|-
└─sfyc|number|是否异常 0:否1：是|-
└─sqwz|string|当前位置:0：气站；1：送气工；2：用户|-
└─dqwzid|string|当前位置ID：气站\送气工\用户对应ID|-
└─lzly|string|流转来源|-
└─lzsj|string|流转时间|-
└─bz|string|备注|-
total|int64|总数|-
size|int64|每页显示条数，默认 10|-
current|int64|当前页|-
orders|array|排序字段信息|-
└─column|string|需要进行排序的字段|-
└─asc|boolean|是否正序排列，默认 true|-
optimizeCountSql|boolean|自动优化 COUNT SQL|-
countId|string|countId|-
maxLimit|int64|countId|-

**Response-example:**
```
{
  "searchCount": true,
  "pages": 313,
  "hitCount": true,
  "records": [
    {
      "id": "97",
      "gpid": "97",
      "ftbm": "bltgri",
      "zt": "ucwes3",
      "sfyc": 250,
      "sqwz": "jmvw4i",
      "dqwzid": "97",
      "lzly": "0wv0pp",
      "lzsj": "2022-02-15 16:30:02",
      "bz": "tb85d5"
    }
  ],
  "total": 200,
  "size": 647,
  "current": 715,
  "orders": [
    {
      "column": "px3xae",
      "asc": true
    }
  ],
  "optimizeCountSql": true,
  "countId": "97",
  "maxLimit": 621
}
```

## 从业人员信息管理
### 人员查询
**URL:** http://localhost:8080/rest/gasPerson/getGasPersonList

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 人员查询

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
pageNum|int32| 页码|false|-
pageSize|int32|每页条数|false|-
xm|string|      姓名|false|-
js|string|      角色|false|-
sfzhm|string|   身份证号码|false|-
zjbh|string|    证件编号|false|-
szdwid|string|  所在单位 ID|false|-

**Request-example:**
```
curl -X GET -i http://localhost:8080/rest/gasPerson/getGasPersonList?szdwid=97&pageNum=1&xm=9m9g3d&zjbh=g0nr0b&pageSize=20&sfzhm=j6dj57&js=1vwev2
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
searchCount|boolean|是否进行 count 查询|-
pages|int64|当前分页总页数|-
hitCount|boolean|是否命中count缓存|-
records|array|查询数据列表|-
└─id|string|ID|-
└─xm|string|姓名|-
└─xb|string|性别|-
└─lxdh|string|联系电话|-
└─js|string|角色|-
└─rzsj|string|入职时间|-
└─sfzhm|string|身份证号码|-
└─zjbh|string|证件编号|-
└─zjyxq|string|证件有效期|-
└─ygzp|string|员工照片|-
└─szdwid|string|所在单位ID|-
└─bz|string|备注|-
total|int64|总数|-
size|int64|每页显示条数，默认 10|-
current|int64|当前页|-
orders|array|排序字段信息|-
└─column|string|需要进行排序的字段|-
└─asc|boolean|是否正序排列，默认 true|-
optimizeCountSql|boolean|自动优化 COUNT SQL|-
countId|string|countId|-
maxLimit|int64|countId|-

**Response-example:**
```
{
  "searchCount": true,
  "pages": 154,
  "hitCount": true,
  "records": [
    {
      "id": "97",
      "xm": "8pgqum",
      "xb": "8x2gkj",
      "lxdh": "6iwq2c",
      "js": "i4teoa",
      "rzsj": {},
      "sfzhm": "a7h9yj",
      "zjbh": "whbnuj",
      "zjyxq": {},
      "ygzp": "cg2fs7",
      "szdwid": "97",
      "bz": "wv5vvs"
    }
  ],
  "total": 575,
  "size": 866,
  "current": 430,
  "orders": [
    {
      "column": "fv5jv8",
      "asc": true
    }
  ],
  "optimizeCountSql": true,
  "countId": "97",
  "maxLimit": 981
}
```

## 充装单位信息管理
### 气站查询
**URL:** http://localhost:8080/rest/gasStation/getGasStationList

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 气站查询

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
pageNum|int32| 页码|false|-
pageSize|int32|每页条数|false|-
zdmc|string|    站点名称/站点别名（用一个参数）|false|-
lxr|string|     联系人|false|-
szdq|string|    所在地区|false|-

**Request-example:**
```
curl -X GET -i http://localhost:8080/rest/gasStation/getGasStationList?lxr=rgx4hj&zdmc=k8smae&pageSize=20&szdq=yjdb7h&pageNum=1
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
searchCount|boolean|是否进行 count 查询|-
pages|int64|当前分页总页数|-
hitCount|boolean|是否命中count缓存|-
records|array|查询数据列表|-
└─id|string|ID|-
└─zdmc|string|站点(充装单位)名称|-
└─zdbh|string|站点编号|-
└─zdbm|string|站点别名|-
└─lxr|string|联系人|-
└─lxdh|string|联系电话|-
└─szdq|string|所在地区(区县)|-
└─x|float|坐标X：WGS84经纬度坐标|-
└─y|float|坐标Y:WGS84经纬度坐标|-
└─xxdz|string|详细地址|-
└─zdzp|string|站点照片访问路经|-
└─yyzzbh|string|营业执照编号|-
└─yyzzzp|string|营业执照图片路径|-
└─czxkzbh|string|充装许可证编号|-
└─czxkzdqsj|string|充装许可证到期时间|-
└─czxkzzp|string|充装许可证图片路径|-
└─rqjyxkzbh|string|燃气经营许可证编号|-
└─rqjyxkzzp|string|燃气经营许可证照片|-
└─bz|string|备用|-
total|int64|总数|-
size|int64|每页显示条数，默认 10|-
current|int64|当前页|-
orders|array|排序字段信息|-
└─column|string|需要进行排序的字段|-
└─asc|boolean|是否正序排列，默认 true|-
optimizeCountSql|boolean|自动优化 COUNT SQL|-
countId|string|countId|-
maxLimit|int64|countId|-

**Response-example:**
```
{
  "searchCount": true,
  "pages": 380,
  "hitCount": true,
  "records": [
    {
      "id": "97",
      "zdmc": "c8i8ou",
      "zdbh": "mq6u7i",
      "zdbm": "ibvtp1",
      "lxr": "dw5a9s",
      "lxdh": "6rfdjy",
      "szdq": "wjgknm",
      "x": 7.13,
      "y": 58.01,
      "xxdz": "q66dj4",
      "zdzp": "33m6ik",
      "yyzzbh": "keg6nm",
      "yyzzzp": "65ve68",
      "czxkzbh": "czkhkf",
      "czxkzdqsj": {},
      "czxkzzp": "c3q2mr",
      "rqjyxkzbh": "e04fxl",
      "rqjyxkzzp": "w4mm4a",
      "bz": "r8v2yf"
    }
  ],
  "total": 204,
  "size": 649,
  "current": 73,
  "orders": [
    {
      "column": "q16b3l",
      "asc": true
    }
  ],
  "optimizeCountSql": true,
  "countId": "97",
  "maxLimit": 667
}
```

## 配送车辆信息管理
### 车辆查询
**URL:** http://localhost:8080/rest/gasTruck/getGasTruckList

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 车辆查询

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
pageNum|int32|  页码|false|-
pageSize|int32| 每页条数|false|-
cph|string|      车牌号|false|-
ssdwid|string|   所属单位 ID|false|-
fzr|string|      负责人|false|-
szdq|string|     所在地区|false|-
ywzdqkssj|string|运危证到期开始时间|false|-
ywzdqjssj|string|运危证到期结束时间|false|-

**Request-example:**
```
curl -X GET -i http://localhost:8080/rest/gasTruck/getGasTruckList?szdq=ubhm6n&cph=exuicd&ywzdqjssj=ow3kus&ywzdqkssj=hww68h&fzr=6ym2wf&pageNum=1&pageSize=20&ssdwid=97
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
searchCount|boolean|是否进行 count 查询|-
pages|int64|当前分页总页数|-
hitCount|boolean|是否命中count缓存|-
records|array|查询数据列表|-
└─id|string|ID|-
└─cph|string|车牌号|-
└─clxh|string|车辆型号|-
└─xszh|string|行驶证号|-
└─ywzh|string|运危证号|-
└─ywzdqsj|string|运危证到期时间|-
└─szdq|string|所在地区|-
└─ssdwid|string|所属单位ID|-
└─fzr|string|负责人|-
└─fzrdh|string|负责人电话|-
└─bz|string|备注|-
total|int64|总数|-
size|int64|每页显示条数，默认 10|-
current|int64|当前页|-
orders|array|排序字段信息|-
└─column|string|需要进行排序的字段|-
└─asc|boolean|是否正序排列，默认 true|-
optimizeCountSql|boolean|自动优化 COUNT SQL|-
countId|string|countId|-
maxLimit|int64|countId|-

**Response-example:**
```
{
  "searchCount": true,
  "pages": 294,
  "hitCount": true,
  "records": [
    {
      "id": "97",
      "cph": "nobrfb",
      "clxh": "4zgu85",
      "xszh": "rxcz69",
      "ywzh": "egebho",
      "ywzdqsj": {},
      "szdq": "97t0uy",
      "ssdwid": "97",
      "fzr": "i009ih",
      "fzrdh": "brpmyx",
      "bz": "xq70w9"
    }
  ],
  "total": 16,
  "size": 829,
  "current": 8,
  "orders": [
    {
      "column": "950pz1",
      "asc": true
    }
  ],
  "optimizeCountSql": true,
  "countId": "97",
  "maxLimit": 732
}
```


