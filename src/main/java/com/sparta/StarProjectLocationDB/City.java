package com.sparta.StarProjectLocationDB;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum City {
    서울("서울", "서울특별시"),
    부산("부산", "부산광역시"),
    대구("대구", "대구광역시" ),
    인천("인천", "인천광역시"),
    광주("광주", "광주광역시"),
    대전("대전", "대전광역시"),
    울산("울산", "울산광역시"),
    //경기
    세종("세종", "경기도"),
    수원("수원", "경기도"),
    성남("성남", "경기도"),
    의정부("의정부","경기도" ),
    안양	("안양", "경기도"),
    부천	("부천", "경기도"),
    광명	("광명", "경기도"),
    평택	("평택", "경기도"),
    동두천("동두천","경기도"),
    안산	("안산","경기도"),
    고양	("고양","경기도"),
    과천	("과천","경기도"),
    구리	("구리","경기도"),
    남양주("남양주", "경기도"),
    오산	("오산", "경기도"),
    시흥	("시흥", "경기도"),
    군포	("군포", "경기도"),
    의왕	("의왕", "경기도"),
    하남	("하남", "경기도"),
    용인	("용인", "경기도"),
    파주	("파주", "경기도"),
    이천	("이천", "경기도"),
    안성	("안성", "경기도"),
    김포	("김포", "경기도"),
    화성	("화성", "경기도"),
    양주	("양주", "경기도"),
    포천	("포천", "경기도"),
    여주	("여주", "경기도"),
    연천	("연천", "경기도"),
    가평	("가평", "경기도"),
    양평	("양평", "경기도"),
    //강원도
    춘천	("춘천","강원도"),
    원주	("원주","강원도"),
    강릉	("강릉","강원도"),
    동해	("동해","강원도"),
    태백	("태백","강원도"),
    속초	("속초","강원도"),
    삼척	("삼척","강원도"),
    홍천	("홍천","강원도"),
    횡성	("횡성","강원도"),
    영월	("영월","강원도"),
    평창	("평창","강원도"),
    정선	("정선","강원도"),
    철원	("철원","강원도"),
    화천	("화천","강원도"),
    양구	("양구","강원도"),
    인제	("인제","강원도"),
    고성	("고성","강원도"),
    양양	("양양","강원도"),
    //충북
    청주	("청주","충청북도"),
    충주	("충주","충청북도"),
    제천	("제천","충청북도"),
    보은	("보은","충청북도"),
    옥천	("옥천","충청북도"),
    영동	("영동","충청북도"),
    증평	("증평","충청북도"),
    진천	("진천","충청북도"),
    괴산	("괴산","충청북도"),
    음성	("음성","충청북도"),
    단양	("단양","충청북도"),
    //충남
    천안	("천안","충청남도"),
    공주	("공주","충청남도"),
    보령	("보령","충청남도"),
    아산	("아산","충청남도"),
    서산	("서산","충청남도"),
    논산	("논산","충청남도"),
    계룡	("계룡","충청남도"),
    당진	("당진","충청남도"),
    금산	("금산","충청남도"),
    부여	("부여","충청남도"),
    서천	("서천","충청남도"),
    청양	("청양","충청남도"),
    홍성	("홍성","충청남도"),
    예산	("예산","충청남도"),
    태안	("태안","충청남도"),
    //전북
    전주	("전주", "전라북도"),
    군산	("군산", "전라북도"),
    익산	("익산", "전라북도"),
    정읍	("정읍", "전라북도"),
    남원	("남원", "전라북도"),
    김제	("김제", "전라북도"),
    완주	("완주", "전라북도"),
    진안	("진안", "전라북도"),
    무주	("무주", "전라북도"),
    장수	("장수", "전라북도"),
    임실	("임실", "전라북도"),
    순창	("순창", "전라북도"),
    고창	("고창", "전라북도"),
    부안	("부안", "전라북도"),
    //전남
    목포	("목포","전라남도"),
    여수	("여수","전라남도"),
    순천	("순천","전라남도"),
    나주	("나주","전라남도"),
    광양	("광양","전라남도"),
    담양	("담양","전라남도"),
    곡성	("곡성","전라남도"),
    구례	("구례","전라남도"),
    고흥	("고흥","전라남도"),
    보성	("보성","전라남도"),
    화순	("화순","전라남도"),
    장흥	("장흥","전라남도"),
    강진	("강진","전라남도"),
    해남	("해남","전라남도"),
    영암	("영암","전라남도"),
    무안	("무안","전라남도"),
    함평	("함평","전라남도"),
    영광	("영광","전라남도"),
    장성	("장성","전라남도"),
    완도	("완도","전라남도"),
    진도	("진도","전라남도"),
    신안	("신안","전라남도"),
    //경북
    포항	("포항","경상북도"),
    경주	("경주","경상북도"),
    김천	("김천","경상북도"),
    안동	("안동","경상북도"),
    구미	("구미","경상북도"),
    영주	("영주","경상북도"),
    영천	("영천","경상북도"),
    상주	("상주","경상북도"),
    문경	("문경","경상북도"),
    경산	("경산","경상북도"),
    군위	("군위","경상북도"),
    의성	("의성","경상북도"),
    청송	("청송","경상북도"),
    영양	("영양","경상북도"),
    영덕	("영덕","경상북도"),
    청도	("청도","경상북도"),
    고령	("고령","경상북도"),
    성주	("성주","경상북도"),
    칠곡	("칠곡","경상북도"),
    예천	("예천","경상북도"),
    봉화	("봉화","경상북도"),
    울진	("울진","경상북도"),
    울릉	("울릉","경상북도"),

    //경남
    창원 ("창원", "경상남도"),
    진주	("진주", "경상남도"),
    통영	("통영", "경상남도"),
    사천	("사천", "경상남도"),
    김해	("김해", "경상남도"),
    밀양	("밀양", "경상남도"),
    거제	("거제", "경상남도"),
    양산	("양산", "경상남도"),
    의령	("의령", "경상남도"),
    함안	("함안", "경상남도"),
    창녕	("창녕", "경상남도"),
    남해	("남해", "경상남도"),
    하동	("하동", "경상남도"),
    산청	("산청", "경상남도"),
    함양	("함양", "경상남도"),
    거창	("거창", "경상남도"),
    합천	("합천", "경상남도"),
    제주	("제주", "제주특별자치도"),
    서귀포시("서귀포시","제주특별자치도");

    private String korName;
    private String state;

    public static City getStarGazingCityByString(String text){
        for (City value : City.values()) {
            if(value.getKorName().equals(text)){
                return value;
            }
        }
        return null;
    }

}
