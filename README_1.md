# ZUUL을 이용한 proxy서버 규현 #1


## RIBBON(Load Balancer)을 이용하여 서버 URI에 따라서  http://www.juso.go.kr 또는 http://openapi.molit.go.kr/를 통한 API 호출을 분기 처리

> -  RIBBON dependency 추가

    zuul.routes.products.path = /addrlink/addrLinkApi.do
    zuul.routes.products.url = http://www.juso.go.kr/
    server.port = 8111


> - request url

    url : http://localhost:8111/addrlink/addrLinkApi.do
    method : POST
    currentPage:1
    countPerPage:20
    keyword:노해로508
    resultType:json
    
> - response

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

## 참고사이트
[참고(https://supawer0728.github.io)](https://supawer0728.github.io/2018/03/11/Spring-Cloud-Zuul/)  
[참고(https://supawer0728.github.io)](https://supawer0728.github.io/2018/03/11/Spring-Cloud-Ribbon%EA%B3%BC-Eureka/)  
  

