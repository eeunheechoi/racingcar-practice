# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)


## 사칙 연산 
# 기능
* 입력받은 문자열을 파싱하여 리스트에 넣는다. 
    * 숫자는 숫자 리스트에 연산자는 연산자 리스트에 넣는다.
* 덧셈 기능이 잘되는지 확인한다
* 뺄셈 기능이 잘되는지 확인한다
* 곱셉 기능이 잘되는지 확인한다
* 나눗셈 기능이 잘되는지 확인한다


# 예외처리
* 빈문자열이 입력되면 IllegalArgumentException 을 던진다.
* 사칙연산 기호가 아닌 경우 IllegalArgumentException 을 던진다.


## 자동차 경주 step3
# 기능
* 0~9 사이의 랜덤 값을 구한다
* 4이상이면 전진한다 


## 자동차 경우 step4
# 기능
* 0~9 사이의 랜덤 값을 구한다
* 4이상이면 전진한다 
* 자동차 이름을 같이 출력한다
* 자동차 이름은 쉽표를 기준으로 구분한다 
* 우승자를 알려준다. 한 명 이상일 수 있다 

# 예외
* 자동차 이름은 5자를 초과할 수 없다 
* 0~9 사이의 랜덤 추가 아니면 예외처리한다 