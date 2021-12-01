package com.sparta.StarProjectLocationDB.api;


import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public enum CampingList {
    경기1("한탄강관광지 오토캠핑장", "경기도 연천군 전곡읍 선사로 76",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4200.png", 127.0588604, 38.008877),
    경기2("중미산자연휴양림", "경기도 양평군 옥천면 신복리 산201-2",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4201.png", 127.4520344, 37.5827073),
    경기3("의왕바라산자연휴양림", "경기도 의왕시 바라산로 84",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4202.png", 127.0193169, 37.3731009),
    경기4("산장국민관광지", "경기도 가평군 상면 덕현산장길 71",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4203.png", 127.410622, 37.7542233),
    경기5("가평명지산카라반글램핑", "경기도 가평군 북면 가화로 2932-23",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4204.png", 127.4476256, 37.9813794),

    강원1("간현관광지","강원도 원주시 지정면 소금산길 12",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4205.png",127.834038,37.3645764),
    강원2("동호해변","강원도 양양군 손양면 동호리 141-26 동호해변관리사무소",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4206.png",128.6824685,38.0583391),
    강원3("서피비치","강원도 양양군 현북면 하조대해안길 119 서피비치",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4207.png",128.7175212,38.0277534),
    강원4("집다리골자연휴양림","강원도 춘천시 사북면 화악지암1길 130 집다리골자연휴양림",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4208.png",127.5805429,37.9780549),
    강원5("아웃오브파크","강원도 춘천시 남면 가옹개길 52-9",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4209.png",127.5112561,37.7278036),

    충북1("옥화자연휴양림","충청북도 청주시 상당구 미원면 운암옥화길 140",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4210.png",127.6943439,36.5989405),
    충북2("송호국민관광지","충청북도 영동군 양산면 송호리 280",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4211.png",127.6774959,36.1308077),
    충북3("속리산사내리야영장","충청북도 보은군 속리산면 법주사로 248-46",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4212.png",127.8254907,36.530903),
    충북4("충주호캠핑월드","충청북도 충주시 동량면 호반로 696-1",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4213.png",128.0415329,37.0274654),
    충북5("문암생태공원","충청북도 청주시 흥덕구 문암동 122-2",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4214.png",127.4474894,36.6747049),

    충남1("공주한옥마을","충청남도 공주시 관광단지길 12",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4215.png",127.1075917,36.4646856),
    충남2("팜카밀레","충청남도 태안군 남면 우운길 56-19",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4216.png",126.2824206,36.6878947),
    충남3("영인산자연휴양림","충청남도 아산시 영인면 아산온천로 16-26",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4217.png",126.9500272,36.8406007),
    충남4("이안숲속","충청남도 공주시 반포면 수목원길 25",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4218.png",127.1993763,36.4226939),
    충남5("어은돌오토캠핑장","충청남도 태안군 소원면 파도리 543-541",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4219.png",126.1346912,36.7505667),

    전북1("무주반디랜드","전라북도 무주군 설천면 무설로 1324",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4220.png",127.7587423,36.0131923),
    전북2("와룡자연휴양림","전라북도 장수군 천천면 비룡로 632 와룡자연휴양림",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4221.png",127.4771927,35.6762574),
    전북3("덕유대오토캠핑장","전라북도 무주군 설천면 백련사길 2",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4222.png",127.7777884,35.8912467),
    전북4("고사포야영장","전라북도 부안군 변산면 운산리 441-11",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4223.png",126.5094373,35.6622947),
    전북5("내장야영장","전라북도 정읍시 내장산로 800 내장야영장",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4224.png",126.9179063,35.4985816),

    전남1("담양 금성산성 오토캠핑장","전라남도 담양군 금성면 금성리 산90",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4225.png",127.0345921,35.3675865),
    전남2("심청관광농원 꿈꾸는캠핑장","전라남도 곡성군 고달면 고달리 산27-1",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4226.png",127.3652063,35.2920313),
    전남3("여수굴전여가캠핑장","전라남도 여수시 돌산읍 돌산로 3017-15",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4227.png",127.7649967,34.6923978),
    전남4("불태산 글램핑","전라남도 장성군 진원면 고산로 61-164",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4228.png",126.8366343,35.2868281),
    전남5("슬로우위켄드SLOWWEEKEND","전라남도 장성군 황룡면 구대해길 3-12",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4229.png",126.751802,35.2636472),

    경북1("통고산자연휴양림","경상북도 울진군 금강송면 불영계곡로 880",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4230.png",129.1917804,36.9337019),
    경북2("청도 신화랑풍류마을","경상북도 청도군 운문면 신화랑길 1",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4231.png",128.9223074,35.7180765),
    경북3("옥계계곡","경상북도 영덕군 달산면 팔각산로 662",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4232.png",129.2589389,36.3297298),
    경북4("구수곡자연휴양림","경상북도 울진군 북면 십이령로 2721",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4233.png",129.2929279,37.0621216),
    경북5("송정자연휴양림","경상북도 칠곡군 석적읍 반계3길 88",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4234.png",128.4416412,36.0233342),

    경남1("금원산자연휴양림","경상남도 거창군 위천면 금원산길 471-27 복합산막콘도",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4235.png",127.7957274,35.7261757),
    경남2("화왕산자연휴양림","경상남도 창녕군 고암면 청간길 128-126",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4236.png",128.5673193,35.5469792),
    경남3("민들레울","경상남도 거창군 북상면 덕유월성로 2188 민들레울",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4237.png",127.8052918,35.7743676),
    경남4("럭셔리글램핑 W 풀빌라","경상남도 산청군 산청읍 웅석봉로285번길 80-20 럭셔리글램핑 W",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4238.png",127.885965,35.3929513),
    경남5("미르캠핑장","경상남도 밀양시 산외면 밀양대로 3400-127",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/camping4239.png",128.8602509,35.5435596);

    private String name;
    private String address;
    private String imgSrc;
    private double locationX;
    private double locationY;

    CampingList(String name, String address, String imgSrc, double locationX, double locationY) {
        this.name = name;
        this.address = address;
        this.imgSrc = imgSrc;
        this.locationX = locationX;
        this.locationY = locationY;
    }

}
