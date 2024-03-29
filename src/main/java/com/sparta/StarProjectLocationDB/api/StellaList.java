package com.sparta.StarProjectLocationDB.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StellaList {
    One(1,"물병자리","황도 12궁 중의 하나이며, 물병자리는 염소자리와 물고기자리 사이에 놓여 있는 별자리이다. 그리스 신화에서 가니메데가 들고 있는 물병이라는 것이 일반적이다.",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/01%E1%84%86%E1%85%AE%E1%86%AF%E1%84%87%E1%85%A7%E1%86%BC%E1%84%8C%E1%85%A1%E1%84%85%E1%85%B5.jpg"),
    Two(2,"물고기자리","황도12궁 중의 하나이며, 물고기자리는 물병자리와 양자리 사이에 놓여 있는 별자리이다. 물고기자리는 고대 메소포타미아 문명에 유래한 별자리이다.",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/02%E1%84%86%E1%85%AE%E1%86%AF%E1%84%80%E1%85%A9%E1%84%80%E1%85%B5%E1%84%8C%E1%85%A1%E1%84%85%E1%85%B5.jpg"),
    Three(3,"양자리", "황도12궁 중의 하나이며, 동아시아의 별자리에서는 루수와 위수에 해당된다. 그리스 신화에서 등장하며 헤르메스가 프릭소스와 헬레 남매를 탈출하기 위해 보낸 황금양이다.",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/03%E1%84%8B%E1%85%A3%E1%86%BC%E1%84%8C%E1%85%A1%E1%84%85%E1%85%B5.jpg"),
    Four(4,"황소자리", "황도 12궁 중의 하나이며, 오리온 자리의 북서쪽에 놓인 별자리이다. 그리스 신화에서는, 제우스가 흰 소로 변신하여 페니키아의 공주인 에우로페를 납치하였다고 한다.",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/04%E1%84%92%E1%85%AA%E1%86%BC%E1%84%89%E1%85%A9%E1%84%8C%E1%85%A1%E1%84%85%E1%85%B5.jpg"),
    Fve(5,"쌍둥이자리", "황도 12궁 중의 하나이며, 오리온자리의 북서쪽에 있는 별자리이다. 카스토르와 폴룩스의 전설과 관련된 별자리이다.",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/05%E1%84%8A%E1%85%A1%E1%86%BC%E1%84%83%E1%85%AE%E1%86%BC%E1%84%8B%E1%85%B5%E1%84%8C%E1%85%A1%E1%84%85%E1%85%B5.jpg"),
    Six(6,"게자리","황도 12궁 중의 하나이며, 서쪽으로 쌍둥이자리, 동쪽으로 사자자리, 북쪽으로 살쾡이자리, 그리고 남쪽으로 작은개자리와 바다뱀자리가 위치하고 있다. 게자리는 영웅 헤라클레스의 발에 밟혀 죽은 불쌍한 게의 별자리이다.",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/06%E1%84%80%E1%85%A6%E1%84%8C%E1%85%A1%E1%84%85%E1%85%B5.jpg"),
    Seven(7,"사자자리" , "황도 12궁 중의 하나이며,  봄철 초저녁 하늘에서 찾아볼 수 있는 별자리이다. 헤라클레스는 신이 되기 위한 12업 중 헤라클레스와 싸운 사자이다.",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/07%E1%84%89%E1%85%A1%E1%84%8C%E1%85%A1%E1%84%8C%E1%85%A1%E1%84%85%E1%85%B5.jpg"),
    Eight(8,"처녀자리","황도 12궁 중의 하나이며,  사자자리와 천칭자리 사이에 놓여 있다. 처녀자리가 정확히 누구를 뜻하는지는 정확하지 않다. 역사 속에서는 거의 대부분의 유명한 여신과 관련되었다.",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/08%E1%84%8E%E1%85%A5%E1%84%82%E1%85%A7%E1%84%8C%E1%85%A1%E1%84%85%E1%85%B5.jpg"),
    Nine(9,"천칭자리","황도 12궁 중의 하나이며, 하늘의 적도 부근의 별자리이다. 정의의 여신인 아스트라이아/아라(처녀자리)가 들고 있는 저울이다.",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/09%E1%84%8E%E1%85%A5%E1%86%AB%E1%84%8E%E1%85%B5%E1%86%BC%E1%84%8C%E1%85%A1%E1%84%85%E1%85%B5.jpg"),
    Ten(10,"전갈자리","황도 12궁 중의 하나이며, 황도를 지나는 남쪽 하늘의 별자리이다. 사냥꾼 오리온을 죽이기 위해 헤라 여신이 보낸 전갈에 해당된다.",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/10%E1%84%8C%E1%85%A5%E1%86%AB%E1%84%80%E1%85%A1%E1%86%AF%E1%84%8C%E1%85%A1%E1%84%85%E1%85%B5.jpg"),
    OneOne(11,"사수자리"," 황도 12궁의 하나이며, 전갈자리의 동쪽, 염소자리의 서쪽에 있는 별자리이다. 흔히 활을 당기는 켄타우로스로 묘사된다.",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/11%E1%84%89%E1%85%A1%E1%84%89%E1%85%AE%E1%84%8C%E1%85%A1%E1%84%85%E1%85%B5.jpg"),
    OneTwo(12,"염소자리","황도 12궁 중의 하나이며, 남쪽 하늘의 별자리이다. 원래의 명칭은 '뿔 달린 염소' 또는 '염소의 뿔'을 의미하며, 하늘의 '바다'에 해당되는 부분에 놓여 있어 바다염소자리(sea-goat)라 부르기도 한다.",
            "https://stella-image-storage.s3.ap-northeast-2.amazonaws.com/12%E1%84%8B%E1%85%A7%E1%86%B7%E1%84%89%E1%85%A9%E1%84%8C%E1%85%A1%E1%84%85%E1%85%B5.jpg");



    private Integer month;
    private String name;
    private String comment;
    private String img;
}
