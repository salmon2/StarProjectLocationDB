# 별 보러 가지 않을래?⭐️
![썸네일](https://user-images.githubusercontent.com/23234577/144531606-3f50649e-982d-4a33-88b4-51558b4f4273.png)

캠핑,차박 하실때 별⭐️도 구경해보세요! 

나만의 장소도 공유하고 다른분들과 추억도 공유해보세요!

## 목차
1. [프로젝트 소개](##프로젝트-소개)
2. [팀원](##팀원)
3. 주요 외부 api

## 프로젝트 소개
캠핑,차박 하실때 별⭐️도 구경해보세요!</br> 나만의 장소도 공유하고 다른분들과 추억도 공유해보세요!👫

- 홈페이지 : [stellakorea](https://stellakorea.co.kr/ "별 보러 가지 않을래?") </br>
- 소개 영상 : https://youtu.be/mB3gAzsY8s4
- 날씨, 천문 데이터 업데이트 서버 : https://github.com/salmon2/StarProjectLocationDB
- 모니터링 서버 : https://github.com/salmon2/StarMonitoringServer

## 팀원
### **Backend**
- 김가민
- 박기남
- 박시준
### **Frontend**
- 심선아
- 이지연
- 홍유미
### **Designer**
- 박선현
- 한주혜

## 주요 외부 api
### Accuweather api
- 별관측지수 가져오기
- [AccuWeather 홈페이지](https://developer.accuweather.com/accuweather-indices-api/apis/get/indices/v1/daily/1day/%7BlocationKey%7D/%7BID%7D)
- code : https://github.com/salmon2/StarProjectLocationDB/blob/master/src/main/java/com/sparta/StarProjectLocationDB/api/accuweatherAPI/AccuWeatherApi.java

### 미세먼지 api
- 전국의 미세먼지 지수 가져오기
- [미세먼지 공공데이터 포털](https://www.data.go.kr/tcs/dss/selectApiDataDetailView.do?publicDataPk=15073861)
- code : https://github.com/salmon2/StarProjectLocationDB/blob/master/src/main/java/com/sparta/StarProjectLocationDB/api/dustApi/DustApi.java

### 위치 api
- 주소를 위경도 변환
  - [네이버 지도 api](https://www.ncloud.com/product/applicationService/maps)
- 위경도를 주소 변환
  - [구글 geolocation api](https://developers.google.com/maps)
- code : https://github.com/salmon2/StarProjectLocationDB/blob/master/src/main/java/com/sparta/StarProjectLocationDB/api/locationAPI/GpsToAddress.java

### 지역별 해, 달 출몰시각 api
- 전국의 일출, 일몰 데이터 가져오기
- [한국천문연구원 api](https://www.data.go.kr/tcs/dss/selectApiDataDetailView.do?publicDataPk=15012688)
- code : https://github.com/salmon2/StarProjectLocationDB/blob/master/src/main/java/com/sparta/StarProjectLocationDB/api/moonRiseAPI/MoonAPI.java

### 날씨 api
- 전국의 날씨 데이터 가져오기
- [기상청 api](https://www.data.go.kr/tcs/dss/selectApiDataDetailView.do?publicDataPk=15084084)
- code : https://github.com/salmon2/StarProjectLocationDB/blob/master/src/main/java/com/sparta/StarProjectLocationDB/api/weatherAPI/WeatherApi.java

### 모든 api 데이터 가져오기
- code : https://github.com/salmon2/StarProjectLocationDB/blob/master/src/main/java/com/sparta/StarProjectLocationDB/api/API.java
- ![image](https://user-images.githubusercontent.com/23234577/144535540-61bfb309-5373-4b51-81b7-a3c53cb738e0.png)

### 스케쥴링
- 해당 api를 지정한 시간에 반복적으로 사용하기
- code : https://github.com/salmon2/StarProjectLocationDB/blob/master/src/main/java/com/sparta/StarProjectLocationDB/scheduled/Schedule.java







