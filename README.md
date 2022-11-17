# 볼링 게임 점수판
## 진행 방법
* 볼링 게임 점수판 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)



## 기능 요구 사항
* 1명 이상의 사용자가 사용할 수 있는 볼링게임 점수판을 구현한다.

## Todo
- [x] 1명 이상의 사용자를 받을 수 있도록 변경 한다.
- [x] 사용자들이 번갈아가며 turn을 진행할 수 있도록 한다.
- [x] step3 리뷰 반영


## 실행 결과
```
How many people? 2
플레이어 1의 이름은?(3 english letters): PJS
플레이어 2의 이름은?(3 english letters): KYJ
| NAME |  01  |  02  |  03  |  04  |  05  |  06  |  07  |  08  |  09  |  10  |
|  PJS |      |      |      |      |      |      |      |      |      |      |
|      |      |      |      |      |      |      |      |      |      |      |
|  KYJ |      |      |      |      |      |      |      |      |      |      |
|      |      |      |      |      |      |      |      |      |      |      |

PJS's turn : 10
| NAME |  01  |  02  |  03  |  04  |  05  |  06  |  07  |  08  |  09  |  10  |
|  PJS |  X   |      |      |      |      |      |      |      |      |      |
|      |      |      |      |      |      |      |      |      |      |      |
|  KYJ |      |      |      |      |      |      |      |      |      |      |
|      |      |      |      |      |      |      |      |      |      |      |

KYJ's turn : 8
| NAME |  01  |  02  |  03  |  04  |  05  |  06  |  07  |  08  |  09  |  10  |
|  PJS |  X   |      |      |      |      |      |      |      |      |      |
|      |      |      |      |      |      |      |      |      |      |      |
|  KYJ |  8   |      |      |      |      |      |      |      |      |      |
|      |      |      |      |      |      |      |      |      |      |      |

KYJ's turn : 2
| NAME |  01  |  02  |  03  |  04  |  05  |  06  |  07  |  08  |  09  |  10  |
|  PJS |  X   |      |      |      |      |      |      |      |      |      |
|      |      |      |      |      |      |      |      |      |      |      |
|  KYJ |  8|/ |      |      |      |      |      |      |      |      |      |
|      |      |      |      |      |      |      |      |      |      |      |

PJS's turn : 8
| NAME |  01  |  02  |  03  |  04  |  05  |  06  |  07  |  08  |  09  |  10  |
|  PJS |  X   |  8   |      |      |      |      |      |      |      |      |
|      |      |      |      |      |      |      |      |      |      |      |
|  KYJ |  8|/ |      |      |      |      |      |      |      |      |      |
|      |      |      |      |      |      |      |      |      |      |      |

PJS's turn : 2
| NAME |  01  |  02  |  03  |  04  |  05  |  06  |  07  |  08  |  09  |  10  |
|  PJS |  X   |  8|/ |      |      |      |      |      |      |      |      |
|      |  20  |      |      |      |      |      |      |      |      |      |
|  KYJ |  8|/ |      |      |      |      |      |      |      |      |      |
|      |      |      |      |      |      |      |      |      |      |      |

KYJ's turn : 10
| NAME |  01  |  02  |  03  |  04  |  05  |  06  |  07  |  08  |  09  |  10  |
|  PJS |  X   |  8|/ |      |      |      |      |      |      |      |      |
|      |  20  |      |      |      |      |      |      |      |      |      |
|  KYJ |  8|/ |  X   |      |      |      |      |      |      |      |      |
|      |  20  |      |      |      |      |      |      |      |      |      |

PJS's turn : 

...
```




~~# step3~~
## 기능 요구 사항
* 스트라이크는 다음 2번의 투구까지 점수를 합산해야 한다. 스페어는 다음 1번의 투구까지 점수를 합산해야 한다.
* 10 프레임은 스트라이크이거나 스페어이면 한 번을 더 투구할 수 있다.

## Todo
- [x] 점수 계산 기능을 구현한다. 
- [x] 점수 계산 기능을 출력한다.

## 실행 결과
```
플레이어 이름은(3 english letters)?: PJS
| NAME |  01  |  02  |  03  |  04  |  05  |  06  |  07  |  08  |  09  |  10  |
|  PJS |      |      |      |      |      |      |      |      |      |      |
|      |      |      |      |      |      |      |      |      |      |      |

1프레임 투구 : 10
| NAME |  01  |  02  |  03  |  04  |  05  |  06  |  07  |  08  |  09  |  10  |
|  PJS |  X   |      |      |      |      |      |      |      |      |      |
|      |      |      |      |      |      |      |      |      |      |      |

2프레임 투구  : 8
| NAME |  01  |  02  |  03  |  04  |  05  |  06  |  07  |  08  |  09  |  10  |
|  PJS |  X   |  8   |      |      |      |      |      |      |      |      |
|      |      |      |      |      |      |      |      |      |      |      |

2프레임 투구 : 2
| NAME |  01  |  02  |  03  |  04  |  05  |  06  |  07  |  08  |  09  |  10  |
|  PJS |  X   |  8|/ |      |      |      |      |      |      |      |      |
|      |  20  |      |      |      |      |      |      |      |      |      |

3프레임 투구 : 8
| NAME |  01  |  02  |  03  |  04  |  05  |  06  |  07  |  08  |  09  |  10  |
|  PJS |  X   |  8|/ |   8  |      |      |      |      |      |      |      |
|      |  20  |  38  |      |      |      |      |      |      |      |      |

3프레임 투구 : 1
| NAME |  01  |  02  |  03  |  04  |  05  |  06  |  07  |  08  |  09  |  10  |
|  PJS |  X   |  8|/ |  8|1 |      |      |      |      |      |      |      |
|      |  20  |  38  |  47  |      |      |      |      |      |      |      |

...
...
```






# step2
## 기능 요구 사항
* 최종 목표는 볼링 점수를 계산하는 프로그램을 구현한다. 1단계 목표는 점수 계산을 제외한 볼링 게임 점수판을 구현하는 것이다.
* 각 프레임이 스트라이크이면 "X", 스페어이면 "9 | /", 미스이면 "8 | 1", 과 같이 출력하도록 구현한다.
    * 스트라이크(strike) : 프레임의 첫번째 투구에서 모든 핀(10개)을 쓰러트린 상태
    * 스페어(spare) : 프레임의 두번재 투구에서 모든 핀(10개)을 쓰러트린 상태
    * 미스(miss) : 프레임의 두번재 투구에서도 모든 핀이 쓰러지지 않은 상태
    * 거터(gutter) : 핀을 하나도 쓰러트리지 못한 상태. 거터는 "-"로 표시
* 10 프레임은 스트라이크이거나 스페어이면 한 번을 더 투구할 수 있다.

## Todo
- [x] 플레이어 이름을 입력 받는다.
- [x] 이름과 10까지의 점수판을 출력한다.
- [x] 게임을 10번 진행한다.
- [x] 게임을 출력한다.


## 실행 결과
```
플레이어 이름은(3 english letters)?: PJS
| NAME |  01  |  02  |  03  |  04  |  05  |  06  |  07  |  08  |  09  |  10  |
|  PJS |      |      |      |      |      |      |      |      |      |      |

1프레임 투구 : 10
| NAM1E |  01  |  02  |  03  |  04  |  05  |  06  |  07  |  08  |  09  |  10  |
|  PJS |  X   |      |      |      |      |      |      |      |      |      |

2프레임 투구 : 8
| NAME |  01  |  02  |  03  |  04  |  05  |  06  |  07  |  08  |  09  |  10  |
|  PJS |  X   |  8   |      |      |      |      |      |      |      |      |

2프레임 투구 : 2
| NAME |  01  |  02  |  03  |  04  |  05  |  06  |  07  |  08  |  09  |  10  |
|  PJS |  X   |  8|/ |      |      |      |      |      |      |      |      |

3프레임 투구 :  7
| NAME |  01  |  02  |  03  |  04  |  05  |  06  |  07  |  08  |  09  |  10  |
|  PJS |  X   |  8|/ |  7   |      |      |      |      |      |      |      |

3프레임 투구 :  : 0
| NAME |  01  |  02  |  03  |  04  |  05  |  06  |  07  |  08  |  09  |  10  |
|  PJS |  X   |  8|/ |  7|- |      |      |      |      |      |      |      |

...
```


~~# 질문 삭제하기 기능 리팩토링~~
## step1
### 요구사항
* 질문 데이터를 완전히 삭제하는 것이 아니라 데이터의 상태를 삭제 상태(deleted - boolean type)로 변경한다.
* 로그인 사용자와 질문한 사람이 같은 경우 삭제 가능하다.
* 답변이 없는 경우 삭제가 가능하다.
* 질문자와 답변글의 모든 답변자가 같은 경우 삭제가 가능하다.
* 질문을 삭제할 때 답변 또한 삭제해야 하며, 답변의 삭제 또한 삭제 상태(deleted)를 변경 한다.
* 질문자와 답변자가 다른 경우 답변을 삭제할수없다.
* 질문과 답변 삭제 이력에 대한 정보를 DeleteHistory를 활용해 남긴다.
* 이 메소드는 단위 테스트하기 어려운 코드와 단위 테스트 가능한 코드가 섞여 있다.
* 단위 테스트하기 어려운 코드와 단위 테스트 가능한 코드를 분리해 단위 테스트 가능한 코드 에 대해 단위 테스트를 구현한다.
