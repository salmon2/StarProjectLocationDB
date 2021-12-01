package com.sparta.StarProjectLocationDB.api.dustApi;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DustCity {
    Seoul("Seoul", 11L, "서울", "서울"),
    Busan("Busan", 26L, "부산", "부산"),
    Daegu("Daegu", 27L, "대구", "대구"),
    Incheon("Incheon", 28L, "인천", "인천"),
    Gwangju("Gwangju", 29L, "광주", "광주"),
    Daejeon("Daejeon", 30L, "대전", "대전"),
    Ulsan("Ulsan", 31L, "울산", "울산"),

    GyeonggiDo("Gyeonggi-do", 41L, "경기" ,"경기"),
    GangwonDo("Gangwon-do", 42L, "강원", "강원"),
    ChungcheongbukDo("Chungcheongbuk-do", 43L, "충북", "충청북도"),
    ChungcheongnamDo("Chungcheongnam-do", 44L, "충남", "충청남도"),

    GyeongsangbukDo("Gyeongsangbuk-do", 43L, "경북", "경상북도"),
    GyeongsangnamDo("Gyeongsangnam-do", 44L, "경남", "경상남도"),
    JeollabukDo("Jeollabuk-do", 45L, "전북", "전라북도"),
    JeollanamDo("Jeollanam-do", 48L, "전남", "전라남도"),
    JejuDo("Jeju-do", 49L, "제주", "제주"),
    Sejong("Sejong", 50L, "세종", "경기");

    private String name;
    private Long Id;
    private String korName;
    private String key;

    public static DustCity getDustCityByString(String text){
        for (DustCity value : DustCity.values()) {
            if(text.contains(value.getKey())){
                return value;
            }
        }
        return null;
    }

}
