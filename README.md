# ZUUL을 이용한 proxy서버 구현


## **사용법**

> -  http://www.juso.go.kr 에서 API 인증키 발급 받고 application.properties에 **whydda.address.confmkey** 프로퍼티 등록
> - properties 내용 (다른 서버로 설정도 가능하다.) 

    zuul.routes.products.path = /addrlink/addrLinkApi.do
    zuul.routes.products.url = http://www.juso.go.kr/
    server.port = 8111

> - test url

    url : http://localhost:8111/addrlink/addrLinkApi.do
    method : POST
    currentPage:1
    countPerPage:20
    keyword:노해로508
    resultType:json
    
> - key는 zuulserver에 존재함으로 제외하고 요청을 보낸다. 

    {
        "results": {
            "common": {
                "errorMessage": "정상",
                "countPerPage": "20",
                "totalCount": "1",
                "errorCode": "0",
                "currentPage": "1"
            },
            "juso": [
                {
                    "detBdNmList": "603동,604동,605동,606동,607동,608동,609동,610동,611동,612동,613동,614동,615동,616동,617동,618동,619동,620동,621동,622동,623동,624동,625동,626동,627동,628동,6단지 관리동",
                    "engAddr": "508, Nohae-ro, Nowon-gu, Seoul",
                    "rn": "노해로",
                    "emdNm": "상계동",
                    "zipNo": "01752",
                    "roadAddrPart2": " (상계동, 상계주공6단지아파트)",
                    "emdNo": "01",
                    "sggNm": "노원구",
                    "jibunAddr": "서울특별시 노원구 상계동 720 상계주공6단지아파트",
                    "siNm": "서울특별시",
                    "roadAddrPart1": "서울특별시 노원구 노해로 508",
                    "bdNm": "상계주공6단지아파트",
                    "admCd": "1135010500",
                    "udrtYn": "0",
                    "lnbrMnnm": "720",
                    "roadAddr": "서울특별시 노원구 노해로 508 (상계동, 상계주공6단지아파트)",
                    "lnbrSlno": "0",
                    "buldMnnm": "508",
                    "bdKdcd": "1",
                    "liNm": "",
                    "rnMgtSn": "113503005047",
                    "mtYn": "0",
                    "bdMgtSn": "1135010500107200000000764",
                    "buldSlno": "0"
                }
            ]
        }
    }  
> 응답 결과를 받을 수 있다.

## 다음 기록 보기
[#1](https://github.com/whydda/zuuladdressproxy/blob/master/README_1.md)

