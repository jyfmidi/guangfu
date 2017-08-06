var data=[
    {name:'沱沱河',altitude:4535,elePrice:0.75,province:'青海',latitude:34.22,longitude:92.433,type:2,fz:0.961111111,dj:0.902777778,qgl:0.0833,fd:2411.576247,bdl:0.008333333,cb:7452.3307,zj:4552.413486,sg:1171.577,td:1728.340214,singlegd:3.926289683,singlexdz:4.036636162,singlesz:4.046324867,multigd:3.090232254,multixdz:3.239352717,multisz:3.23406379},
    {name:'冷湖',altitude:2771,elePrice:0.75,province:'青海',latitude:38.833,longitude:93.38,type:2,fz:0.955555556,dj:0.902777778,qgl:0.0833,fd:2324.216676,bdl:0.022222222,cb:7436.838679,zj:4552.413486,sg:1171.577,td:1712.848193,singlegd:4.095647208,singlexdz:4.188167456,singlesz:4.196621299,multigd:3.19971832,multixdz:3.353220372,multisz:3.348417079},
    {name:'通辽',altitude:180,elePrice:0.75,province:'内蒙古',latitude:43.60,longitude:122.267,type:2,fz:0.902777778,dj:0.905555556,qgl:0.026502401,fd:2028.138851,bdl:0.069444444,cb:7321.499174,zj:4552.413486,sg:1171.577,td:1597.508689,singlegd:4.637789586,singlexdz:4.724445123,singlesz:4.737307726,multigd:3.60995953,multixdz:3.766150579,multisz:3.763884293},
    {name:'德令哈',altitude:2982,elePrice:0.75,province:'青海',latitude:37.367,longitude:97.37,type:2,fz:0.933333333,dj:0.902777778,qgl:0.0833,fd:2145.944379,bdl:0.141666667,cb:7393.896289,zj:4552.413486,sg:1171.577,td:1669.905803,singlegd:4.413759985,singlexdz:4.519682168,singlesz:4.530870742,multigd:3.445520937,multixdz:3.615734962,multisz:3.612399984},
    {name:'都兰',altitude:3192,elePrice:0.75,province:'青海',latitude:36.3,longitude:98.1,type:2,fz:0.916666667,dj:0.902777778,qgl:0.0833,fd:2070.665039,bdl:0.202777778,cb:7424.397307,zj:4552.413486,sg:1171.577,td:1700.406821,singlegd:4.57276614,singlexdz:4.692867325,singlesz:4.704352063,multigd:3.585513431,multixdz:3.760548402,multisz:3.755679622},
    {name:'马鬃山',altitude:1770,elePrice:0.75,province:'甘肃',latitude:41.8,longitude:97.03,type:2,fz:0.913888889,dj:0.991666667,qgl:0.3045,fd:2049.816562,bdl:0.475,cb:6243.477592,zj:4552.413486,sg:1171.577,td:519.4871062,singlegd:4.072788852,singlexdz:3.945505611,singlesz:3.985266946,multigd:3.045871375,multixdz:2.983276608,multisz:3.008590806},
    {name:'和田',altitude:1375,elePrice:0.75,province:'新疆',latitude:37.133,longitude:79.93,type:2,fz:0.85,dj:0.983333333,qgl:0.3223,fd:1926.687954,bdl:0.213888889,cb:6404.011043,zj:4552.413486,sg:1171.577,td:680.0205573,singlegd:4.412873774,singlexdz:4.314788545,singlesz:4.353096051,multigd:3.323844439,multixdz:3.293853515,multisz:3.316555158},
    {name:'二连浩特',altitude:966,elePrice:0.65,province:'内蒙古',latitude:43.65,longitude:112,type:1,fz:0.919444444,dj:0.822222222,qgl:0.026502401,fd:1794.690264,bdl:0.794444444,cb:7853.844414,zj:4552.413486,sg:1171.577,td:2129.853929,singlegd:5.53206714,singlexdz:5.749917107,singlesz:5.749189306,multigd:4.376155914,multixdz:4.674900826,multisz:4.656781633},
    {name:'伊吾',altitude:1729,elePrice:0.75,province:'新疆',latitude:43.27,longitude:94.7,type:2,fz:0.911111111,dj:0.972222222,qgl:0.3223,fd:2045.871567,bdl:0.058333333,cb:6955.212356,zj:4552.413486,sg:1171.577,td:1231.221871,singlegd:4.421944088,singlexdz:4.437985311,singlesz:4.460122322,multigd:3.399632933,multixdz:3.483258627,multisz:3.490579023},
    {name:'曲麻莱',altitude:4176,elePrice:0.75,province:'青海',latitude:34.13,longitude:95.78,type:2,fz:0.744444444,dj:0.902777778,qgl:0.0833,fd:1813.358581,bdl:0.166666667,cb:7447.51992,zj:4552.413486,sg:1171.577,td:1723.529435,singlegd:5.221549031,singlexdz:5.366655325,singlesz:5.379580964,multigd:4.107031007,multixdz:4.305614902,multisz:4.298835027},
    {name:'通河',altitude:110,elePrice:0.75,province:'黑龙江',latitude:45.97,longitude:128.733,type:2,fz:0.816666667,dj:0.719444444,qgl:0.015224368,fd:1896.197164,bdl:0.536111111,cb:8488.586066,zj:4552.413486,sg:1171.577,td:2764.59558,singlegd:5.564331965,singlexdz:5.895514357,singlesz:5.876890313,multigd:4.476636832,multixdz:4.88679605,multisz:4.851365466},
    {name:'阳城',altitude:659,elePrice:0.85,province:'山西',latitude:35.48,longitude:112.4,type:3,fz:0.533333333,dj:0.766666667,qgl:0.018720134,fd:1781.528415,bdl:0.258333333,cb:7957.952615,zj:4552.413486,sg:1171.577,td:2233.962129,singlegd:5.572985757,singlexdz:5.84614759,singlesz:5.845722306,multigd:4.466924327,multixdz:4.779783006,multisz:4.75716328},
    {name:'赣州',altitude:138,elePrice:0.85,province:'江西',latitude:25.867,longitude:115,type:3,fz:0.419444444,dj:0.836111111,qgl:0.016567738,fd:1660.646082,bdl:0.847222222,cb:7614.507201,zj:4552.413486,sg:1171.577,td:1890.516715,singlegd:5.837182028,singlexdz:6.060886983,singlesz:6.070714309,multigd:4.585267916,multixdz:4.896150225,multisz:4.887385784},
    {name:'泰来',altitude:150,elePrice:0.75,province:'黑龙江',latitude:46.40,longitude:123.417,type:2,fz:0.666666667,dj:0.752777778,qgl:0.015224368,fd:1736.11501,bdl:0.372222222,cb:8045.680455,zj:4552.413486,sg:1171.577,td:2321.689969,singlegd:5.827120217,singlexdz:6.098557512,singlesz:6.092226581,multigd:4.634301535,multixdz:4.990255479,multisz:4.965838719},
    {name:'奇台',altitude:794,elePrice:0.75,province:'新疆',latitude:44.02,longitude:89.567,type:2,fz:0.852777778,dj:0.972222222,qgl:0.3223,fd:1926.702057,bdl:0.286111111,cb:6984.291704,zj:4552.413486,sg:1171.577,td:1260.301218,singlegd:4.710255255,singlexdz:4.72451983,singlesz:4.746640353,multigd:3.624998312,multixdz:3.710974152,multisz:3.717334885}
];