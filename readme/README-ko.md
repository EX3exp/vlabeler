# vLabeler

[![Discord](https://img.shields.io/discord/984044285584359444?style=for-the-badge&label=discord&logo=discord&logoColor=ffffff&color=7389D8&labelColor=6A7EC2)](https://discord.gg/yrTqG2SrRd)

언어 선택: [English](../README.md) | [简体中文](README-zhCN.md) | [日本語](README-ja.md) | [한국어](README-ko.md)

&nbsp;`vLabeler`는 다음 목표를 따르는 오픈소스 음성 라벨링 프로그램이에요.

- &nbsp;현대적이고 유연한 UI/UX
- &nbsp;다양한 음성합성엔진에 맞춘 커스텀이 가능한 라벨링 환경
- &nbsp;높은 성능 보장, 크로스 플랫폼 지원

**&nbsp;도움, 피드백, 오류 제보 등은 [디스코드](https://discord.gg/yrTqG2SrRd)로 문의해 주세요.**

<details>
<summary>데모 영상 (영문)</summary>
&nbsp;초기 버전이었던 1.0.0-beta1의 영상으로, ui가 최신 버전의 vLabeler와 많이 다를 수 있어요. 

[유튜브](https://youtu.be/xFX8SRrJEzM) | [비리비리](https://www.bilibili.com/video/BV1Ve4y1S7FF)
</details>

<br>

## 다운로드

&nbsp;[Releases](https://github.com/sdercolin/vlabeler/releases) 를 봐 주세요.

&nbsp;Releases에 빌드본이 제공되는 플랫폼들은 다음과 같아요.

- 윈도우: `~win64.zip`
- 맥 (인텔): `~mac-x64.dmg`
- 맥 (애플 실리콘): `~mac-arm64.dmg`
- 우분투: `~amd64.deb`

&nbsp;기타 리눅스 계열 운영체제들을 사용하실 경우, 직접 빌드하셔야 해요.

<br>

## 빌드

&nbsp;vLabeler는 [Compose Multiplatform](https://github.com/JetBrains/compose-jb)을 사용하고 있어요. 빌드에는 Gradle이 사용되며, 상세한 내용은 [이곳](https://github.com/JetBrains/compose-jb/tree/master/tutorials/Native_distributions_and_local_execution)을 참조해 주세요.

&nbsp;현재 크로스 플랫폼 빌드는 지원되고 있지 않아요. 사용 중인 운영체제를 지정해 빌드하는 것만 가능합니다.

&nbsp;빌드에는 **JDK 17** 이상이 필요해요.

```
// 인스톨러를 사용해 앱 설치 패키지를 만들거나
./gradlew packageDistributionForCurrentOS

// 실행 가능한 형태의 앱을 만들 수 있어요
./gradlew createDistributable
```

<br>

## 시나리오

&nbsp;vLabeler 동작의 대부분은 유저 커스텀이 가능한 `라벨러`들에 의해 이루어져요.<br>
&nbsp;아래에서는 기본 내장 라벨러들을 다루고 있답니다. :

#### UTAU의 oto.ini를 편집할래요

![](../readme/utau-singer.gif)

&nbsp;UTAU oto 편집(원음설정)용 내장 라벨러는 두 종류에요 :

- UTAU oto 라벨러

  &nbsp;한 개의 `oto.ini`만 편집할 때 사용해요.

- UTAU singer 라벨러

  &nbsp;가수 폴더에 포함된 여러 개의 `oto.ini`를 편집할 때 사용해요.<br>
  &nbsp;`샘플 폴더`는 반드시 가수의 루트 폴더로 지정해 주세요. (주로 `character.txt`를 포함하는, 가수의 가장 바깥쪽 폴더를 '가수의 루트 폴더' 라고 합니다.)

#### 오디오 라벨 파일을 편집할래요

![](../readme/nnsvs-singer.gif)

&nbsp;NNSVS/ENUNU 계열 라벨 파일용 내장 라벨러는 다음과 같아요. :

- Sinsy lab 라벨러
  
  &nbsp;Sinsy(NNSVS/ENUNU) lab 파일을 편집할 때 사용해요. Sinsy lab은 시간 단위로 `100 나노초`, 구분자로 ` `(스페이스 공백)을 사용하는 형식이랍니다. <br>
  &nbsp;각 프로젝트 당 한 개의 라벨 파일만 다룰 수 있어요. wav 파일은 파일명을 통해 라벨 파일과 연결됩니다. (예시: 파일명이 `foo.lab`인 라벨 파일은 `샘플 폴더` 내의 `foo.wav`와 대응됩니다.) 

- Audacity 라벨러

  &nbsp;Audacity를 통해 만든 `레이블` 파일을 편집할 때 사용해요. Audacity `레이블` 파일은 시간 단위로 `초`, 구분자로 `\t` (탭)을 사용하는 형식이랍니다. <br>
  &nbsp;각 프로젝트 당 한 개의 라벨 파일만 다룰 수 있어요. wav 파일은 파일명을 통해 라벨 파일과 연결됩니다. (예시: 파일명이 `foo.txt`인 라벨 파일은 `샘플 폴더` 내의 `foo.wav`와 대응됩니다.) 

- NNSVS singer 라벨러

  &nbsp;`Sinsy lab 라벨러`와 기본적으로 똑같지만, 여러 개의 라벨 파일을 편집할 수 있답니다.<br>
  &nbsp;주로 singer 폴더의 파일 구조가 하단과 같을 때 이 라벨러를 사용해요.
  ```
  - singer
      - wav
        - 1.wav
        - 2.wav
      - lab
        - 1.lab
        - 2.lab
  ```
  &nbsp;위의 예시에서는, `singer`폴더의 경로를 `샘플 폴더`의 경로로 설정함으로써 모든 라벨 파일들을 포함하는 프로젝트를 만들 수 있어요. <br>
  &nbsp;`wav` 폴더 및 `lab` 폴더의 이름은 라벨러 설정에서 바꿀 수 있답니다.


#### 기본 내장 라벨러 이외의 다른 라벨러가 필요해요

- &nbsp;TextGrid 라벨러 (Praat TextGrid 용) : &nbsp;[깃헙](https://github.com/sdercolin/vlabeler-textgrid)

<br>

## 시작하기

1. &nbsp;`새 프로젝트...`를 눌러 주세요.
2. &nbsp;`샘플 폴더`를 샘플 파일들이 들어 있는 폴더로 설정합니다.
3. &nbsp;`프로젝트 이름`을 원하는 이름으로 바꿔 주세요.
4. &nbsp;라벨러를 선택하세요. 무슨 라벨러를 써야 할지 모르겠다면, [시나리오](#시나리오) 항목을 읽어 봅시다. 
5. &nbsp;프로젝트 생성 방식을 선택해 주세요. 보통은 `기본`을 선택하면 무방합니다. 
6. &nbsp;(프로젝트 생성 방식에서) `파일`을 선택하고 원하는 단일 파일의 경로를 설정하면 입력 파일을 사용할 수 있어요. &nbsp;(라벨러에 따라 `파일` 선택지가 없을 수도 있어요.)
7. &nbsp;(프로젝트 생성 방식) `템플릿 생성기`를 선택하고 원하는 플러그인을 지정하면, 플러그인으로 템플릿을 생성할 수 있어요.
8. &nbsp;`완료`를 누르고 라벨 편집을 시작합시다.
9. &nbsp;메뉴에서 `내보내기`를 누르면, 편집된 라벨 파일을 출력할 수 있어요.

&nbsp;`고급 설정`을 누르면, 접혀 있던 더 많은 설정 메뉴들이 나타나요. 라벨러/플러그인이 제공하는 고유 설정 메뉴들도 있으니, 추가적인 커스텀을 원한다면 관련 내용들에 관해 추가로 알아봅시다. 

<br>

## 키보드/마우스 동작 설명서

&nbsp;(맥 운영체제를 사용할 경우) 하단 설명에 나오는 `Ctrl`키는 `Command`키와 같은 뜻이에요.

&nbsp;단축키는 `설정` -> `환경설정` -> `단축키`에서 설정할 수 있어요.


### 마커 이동시키기

- 일반 마커 위에서 드래그: &nbsp;마커 이동.
- 주요 마커 위에서 드래그: &nbsp;모든 마커를 한꺼번에 이동.
- `Shift`: &nbsp;일반 마커와 주요 마커 전환. <br>&nbsp;(예시: `Shift`를 누른 채 주요 마커를 드래그하면, 주요 마커만 움직여요.) 
- `Q`/`W`/`E`/`R`/... : &nbsp;해당하는 마커를 현재의 커서 위치로 이동. <br>마커의 순서는 라벨러가 정의하며, 단일 편집 모드에서만 이용 가능한 기능이에요.


### 오디오 재생

- `Space`: &nbsp;현재 엔트리 재생/정지.
- `Shift` + `Space`: &nbsp;현재 샘플 재생/정지.
- `Ctrl` + `Shift` + `Space`: &nbsp;현재 화면에 표시되는 영역 재생/정지.
- (대부분의 도구에서) 오른쪽 마우스 클릭 : &nbsp;클릭된 부분 재생.
- (**커서** 도구에서) `Alt` + 마커 위에서 드래그: &nbsp;커서 주변 범위에 해당하는 오디오 재생.

&nbsp;더 많은 내용은 [재생 도구](#재생-도구)에서 확인해 주세요.

### 스크롤 동작

- `Shift` + 마우스 스크롤: &nbsp;수평 스크롤.
- `F`나 하단 바의 집중 버튼: &nbsp;현재 엔트리가 화면의 중앙에 오도록 스크롤.

### 확대/축소 동작

- `=`나 하단 바의 `+` 버튼: &nbsp;확대.
- `-`나 하단 바의 `-` 버튼: &nbsp;축소.
- `Ctrl` + `Shift` + 마우스 스크롤: &nbsp;확대/축소.
- 하단 바의 해상도 버튼: &nbsp;해상도 입력 대화창 보이기.

### 엔트리/샘플 전환

- 마우스 스크롤: &nbsp;이전/다음 엔트리로.
- `위 방향키`/`아래 방향키`: &nbsp;이전/다음 엔트리로.
- 하단 바의 `<`/`>` 버튼: &nbsp;이전/다음 엔트리로.
- `Ctrl` + 마우스 스크롤: &nbsp;이전/다음 샘플로.
- `Ctrl` + `위 방향키`/`아래 방향키`: &nbsp;이전/다음 샘플로.
- 하단 바의 `<<`/`>>` 버튼: &nbsp;이전/다음 샘플로.
- `Ctrl` + `G`나 하단 바의 엔트리 번호 버튼: &nbsp;`엔트리 이동...` 대화창 보이기.

### 엔트리 상태 표기

- `J`나 엔트리 상단 바의 `태그 추가` 버튼: &nbsp;엔트리의 태그 편집.
- `K`나 엔트리 상단 바의 `중요` 버튼: &nbsp;엔트리의 `중요` 상태 전환.
- `L`이나 엔트리 상단 바의 `완료` 버튼: &nbsp;엔트리의 `완료` 상태 전환.

#### 상태 표기 설정

&nbsp;`설정` -> `환경설정` -> `에디터` -> `엔트리 상태 표기` 에서 변경할 수 있어요.

### 사전편집 동작

&nbsp;`설정` -> `환경설정` -> `에디터` -> `사전편집 동작` 에서, 엔트리 편집 후 자동으로 이어질 동작을 설정할 수 있어요. :

- &nbsp;다음 엔트리로 이동
- &nbsp;편집된 엔트리에 자동으로 `완료` 표시 (기본으로 활성화)

### 빠르게 일괄 편집 플러그인을 사용하는 법

- &nbsp;`F1`~`F8`: 상응하는 일괄 편집 플러그인 실행. 사용하려면 `도구` -> `일괄 편집` -> `슬롯 설정...` 에서 설정을 조정해 주세요. 자세한 내용은 [플러그인 목록](#플러그인-목록)에서 확인해 주세요.

<br>

## 다중 편집 모드 설명서

&nbsp;연속 편집용 라벨러들([예시](#오디오-라벨-파일을-편집할래요))에서는, 단일 편집 모드와 다중 편집 모드를 전환할 수 있어요. 다중 편집 모드에서는 같은 샘플 파일에 연결된 모든 엔트리들을 보거나 편집할 수 있답니다.

&nbsp;기본적으로 다중 편집 모드는 활성화되어 있어요. 하단 바 가운데의 `단일/다중` 버튼을 눌러 비활성화할 수 있습니다.

&nbsp;다중 편집 모드에서는, 엔트리들의 이름이 에디터의 맨 위에 표시되요. 이름을 클릭하면 아래의 기능을 사용할 수 있어요. :

- 클릭: &nbsp;엔트리 이름 변경
- 길게 클릭: &nbsp;해당 엔트리로 이동

<br>

## 기타 오디오 형식 지원

&nbsp;`ffmpeg`를 통해 더 많은 오디오 형식을 사용할 수 있어요. [공식 사이트](https://ffmpeg.org/download.html)에서 `ffmpeg`를 설치한 후, `설정` -> `환경설정` -> `차트` -> `지원되는 오디오 형식`에서 `ffmpeg` 실행 파일의 경로를 지정해 주세요.

&nbsp;맥/리눅스를 사용할 경우, 시스템 경로나 `bin`에 `ffmpeg`를 설치해 기본 경로의 `ffmpeg`가 동작할 수 있게 해 주세요.

<br>

## 영상 통합

&nbsp;샘플 파일과 같은 이름, 같은 길이의 영상 파일을 추가해 편집 도중 영상을 재생할 수 있어요. 

예시:

```
(샘플 폴더)
    - 1.wav
    - 1.mp4
    - 2.wav
    - 2.webm
```

&nbsp;**이 기능을 사용하려면 VLC가 설치되어 있어야 해요.** ([다운로드 링크](https://www.videolan.org/vlc/index.html))

&nbsp;(`Release`에서 배포된 앱 이용 시) 애플 실리콘 맥의 경우, `macOS (AppleSilicon)`이 아닌 `macOS`버전이 필요해요.

&nbsp;단축키 `Ctrl` + `V`나 `Ctrl` + `Shift` + `V`를 사용하면, 왼쪽 아래 모서리에서 영상을 열거나 새로운 창에서 영상을 열 수 있어요.

&nbsp;영상은 샘플 파일과 함께 재생되며, 무음입니다.

<br>

## 엔트리 탐색하기

엔트리 목록에는 두 가지 요소가 있어요. :

1. 엔트리 목록: &nbsp;기본적으로 우측에 보여져요. `외형` -> `엔트리 목록 표시`에서 숨기거나 보이게 할 수 있어요. 모든 기능을 지닌 엔트리 필터(하단에 설명 있음)를 제공해 줍니다.
2. `엔트리 이동...` 대화창: &nbsp;`Ctrl` + `G`나 하단 바에서 엔트리 번호 버튼을 누르면 보여져요.
   간단한 엔트리 필터를 제공해 줍니다.

### 엔트리 필터링 및 검색

&nbsp;두 종류의 엔트리 목록 모두에서, 다음의 문법을 사용한 엔트리 검색을 할 수 있어요. :

```
aaa;name:bbb;sample:ccc;tag:ddd
```

&nbsp;`;`을 사용해 여러 개의 조건을 결합할 수 있어요. 전체 조건을 만족하는 엔트리만 화면에 보여집니다.

다음의 조건 키들 (`:`의 왼쪽)이 지원됩니다. :

- 키 없음: &nbsp;엔트리 이름, 샘플 이름(확장자 제외), 태그에서 검색
- `name`: &nbsp;엔트리 이름에서 검색
- `sample`: &nbsp;샘플 이름(확장자 제외)에서 검색
- `tag`: &nbsp;태그에서 검색

&nbsp;매칭 시 `포함 여부`를 기준으로 삼습니다.

&nbsp;더 많은 선택지들을 보려면, 엔트리 목록에서 `확장` 버튼을 누르세요.

&nbsp;`완료` 필터와 `중요` 필터를 선택하면, `필터 미적용`, `"완료"/"중요" 엔트리만 표시`, `"완료"/"중요" 엔트리만 제외"` 간의 상태가 전환됩니다.

&nbsp;개별적으로 조건을 설정하는 대화창은 `더보기`버튼을 눌러 열 수 있어요.

&nbsp;모든 필터들은 `AND` 논리로 연결됩니다.

### 에디터에서 엔트리 필터 적용하기

&nbsp;기본적으로 프로젝트 탐색(다음 엔트리로/다음 샘플로 등)은 필터 적용의 영향을 받지 않아요.

&nbsp;예를 들어, 필터를 적용해 엔트리 목록에서 `다섯 번째 엔트리`가 보이지 않도록 해 볼게요. 이 경우, `네 번째 엔트리`에서  `아래 방향키`를 누르면 (엔트리 목록에 `다섯 번째 엔트리`가 없음에도)`다섯 번째 엔트리`로 접근됩니다. 

&nbsp;이 때 (확장된 메뉴에서) `연결` 버튼을 누르면, 엔트리 목록에 보여지지 않는 엔트리들을 프로젝트 탐색에서 스킵할 수 있어요. 자신이 원하는 집합의 엔트리들에게 좀 더 집중할 수 있게 되죠.

&nbsp;앞서 들었던 예시를 기반으로 설명하면, `연결` 버튼을 활성화한 상태에서 `네 번째 엔트리`에서 `아래 방향키`를 누르면, `다섯 번째 엔트리` 대신 `여섯 번째 엔트리`로 이동합니다.

&nbsp;참고로, `엔트리 이동...` 대화창은 이 연결 버튼의 영향을 받지 않는답니다. 목록에서 필터링된 엔트리로 이동하기 위해 엔트리 목록에 적용된 필터를 해제할 필요는 없어요.

<br>

## 도구 설명서

&nbsp;하단의 도구들이 제공됩니다.
`편집` -> `도구`나, `외형` -> `도구바 표시`를 통해 표시한 도구바에서 도구를 전환할 수 있어요.

### 커서 도구

&nbsp;마커를 드래그할 때 사용하는 일반적인 도구에요.

### 가위 도구

&nbsp;클릭된 위치를 기준으로 엔트리를 두 부분으로 쪼개는 도구에요. [다중 편집 모드](#다중-편집-모드-설명서)에서 새 라벨을 만드는 용도로 주로 사용됩니다.

&nbsp;올바른 위치를 가위 도구로 클릭했을 때 기본적으로 다음과 같은 일이 일어나요. :

1. &nbsp;잘린 영역의 첫 번째 부분이 재생되요. 음소 확인의 용이함을 위함이에요.
2. &nbsp;첫 번째 부분의 이름을 입력하는 상자가 에디터에 표시됩니다.
3. &nbsp;`Enter`를 눌러 입력을 확정하거나, `Esc`를 눌러 취소할 수 있어요.
4. &nbsp;클릭된 지점 밖으로 커서를 옮겨도 입력이 확정됩니다.
5. &nbsp;자르기가 끝났습니다. 첫 번째 부분은 입력된 이름을 사용할 것이고, 두 번째 부분은 자르기 전부터 있던 원래의 이름을 사용할 거에요.
6. &nbsp;에디터가 첫 번째 부분이 속한 엔트리로 이동합니다.

&nbsp;단일 편집 모드에서의 이름 입력은 에디터 내부가 아닌, 대화창을 통해 이루어져요.

&nbsp;가위 도구의 커스텀은 `환경설정` -> `에디터` -> `가위`에서 가능해요.

### 손바닥 도구

&nbsp;에디터 안에서 드래그하면 캔버스를 스크롤해 주는 도구에요.

### 재생 도구

&nbsp;마우스 클릭이나 드래그를 통해 현재 샘플 파일에서 특정 범위를 재생할 수 있게 해주는 도구에요.
&nbsp;기본적으로 하단의 동작들이 지원됩니다. 사용되는 키는 `설정` -> `환경설정` -> `단축키` -> `마우스 입력`에서 변경할 수 있어요.

- 왼쪽 클릭: &nbsp;클릭된 위치 ~ 끝까지 재생해요.
- 오른쪽 클릭: &nbsp;클릭된 위치 ~ 현재 화면에 표시된 영역의 끝까지 재생해요.
- `Shift` + 왼쪽 클릭: &nbsp;처음 ~ 클릭된 위치까지 재생해요.
- `Shift` + 오른쪽 클릭: &nbsp;현재 화면에 표시된 영역의 시작 ~ 클릭된 위치까지 재생해요.
- `Ctrl` + 왼쪽 클릭 & 드래그: &nbsp;드래그된 범위의 오디오를 재생해요.
- `Ctrl` + `Shift` + 왼쪽 클릭 & 드래그: &nbsp;드래그된 범위의 오디오를 반복해서 재생해요.

<br>

## 라벨러 목록

&nbsp;"라벨러"는 특정한 종류의 음성합성엔진들에 맞추어 `vLabeler`의 동작을 규정하는 일종의 설정 파일이에요. 예를 들어, 내장되어 있는 `UTAU oto 라벨러`는 UTAU의 `oto.ini`를 편집하기 위한 라벨러에요. 

&nbsp;라벨러가 정의하는 것들은 다음과 같아요:

- &nbsp;엔트리들이 어떠한 데이터/필드를 필요로 하는가? (예시: UTAU의 경우, `고정자음부`, `선행자음부`, `오버랩` 등이 필요할 거에요.)
- &nbsp;마커를 제어하기 위해, 데이터/필드들은 어떤 방식으로 에디터에 표시되어야 하는가?
- &nbsp;엔트리들이 반드시 연결되어 있어야만 하는가? (모든 엔트리들의 시작이 이전 엔트리의 끝과 일치해야 하는가?)
- &nbsp;어떠한 방식으로 `vLabeler` 프로젝트에 라벨 파일을 파싱해 올 것인가? 
- &nbsp;`vLabeler` 프로젝트 내에서 어떻게 라벨 파일을 생성할 것인가?
- &nbsp;`vLabeler` 프로젝트에 속한 하위 프로젝트들은 어떻게 구축할 것인가?
- &nbsp;그 이외에 특정 라벨 파일을 편집하는 데에 필요한 동작들은 무엇인가?

&nbsp;라벨러는 라벨러의 파일 그 자체를 바꿀 필요 없이, 몇몇 설정 가능한 필드들을 GUI를 통해 지원할 수 있습니다. `새 프로젝트` 창의 라벨러 선택란 옆에 있는 `설정` 아이콘을 누르면, 라벨러에서 지원하는 설정을 찾을 수 있어요.

&nbsp;`vLabeler`가 지원하지 않는 특정 음성합성엔진의 라벨을 편집하고 싶다면, 해당 음성합성엔진을 지원하는 개발을 요청할 수도 있지만 직접 만들어 보는 것도 방법이에요 (물론 약간의 코딩 지식이 필요합니다).
라벨러 개발에 흥미가 있다면, [커스텀 라벨러 개발(영문)](docs/labeler-development.md)을 읽어 보세요.

&nbsp;만들어진 라벨러는 `설정` -> `라벨러 목록...`에서 불러올 수 있어요. 또한 자작 라벨러는 어디든 배포해도 좋습니다. 자작 라벨러가 내장 라벨러로 만들어지길 원한다면, 저희에게 연락해 주세요.


<br>

## 플러그인 목록

&nbsp;현재 사용 가능한 플러그인은 두 종류에요.

### 템플릿 생성기

&nbsp;입력 파일과 파라미터들을 통해 프로젝트 템플릿을 만들 수 있게 해 줘요.

&nbsp;라벨러에 의해 생성된 기본 방식의 템플릿은, 모든 샘플 파일을 포함하기 위한 가장 최소한의 사양을 지닙니다. 반면 템플릿 생성기 플러그인은 더욱 복잡한 템플릿을 만들어 낼 수 있어요. 사용자 입력 파라미터들을 사용해 더욱 커스텀이 용이합니다.

&nbsp;선택된 라벨러를 지원하는 모든 템플릿 생성기들은 `새 프로젝트` 창에서 선택할 수 있어요. 

&nbsp;`설정` -> `템플릿 생성기...`에서 템플릿 생성기들을 불러오거나/지우거나/비활성화할 수 있습니다.

### 일괄 편집 플러그인

&nbsp;복잡한 일괄 편집을 책임져 주는 일괄 편집 플러그인들이에요.

&nbsp;`도구` -> `일괄 편집`에서 사용 가능한 일괄 편집 플러그인을 찾을 수 있습니다. 표시되어 있지만 클릭이 불가능한 몇몇 플러그인들이 있을 수도 있어요. 이는 해당 라벨러가 그 플러그인을 지원하지 않기 때문이에요.

&nbsp;`도구` -> `일괄 편집` -> `플러그인 관리...`에서 일괄 편집 플러그인들을 불러오거나/지우거나/비활성화할 수 있습니다.


#### 기타 플러그인 목록 (내장 플러그인 이외)

- [리샘플러 테스트(resampler-test)](https://github.com/sdercolin/vlabeler-resampler-test): &nbsp;UTAU 리샘플러가 현재 엔트리를 합성한 결과물을 재생할 수 있어요. 셋파람의 synthesis test (F10)와 비슷한 기능이에요.
- [오토 타이밍 테스트(oto-timing-test)](https://github.com/chexq09/vlabeler-oto-timing-check): &nbsp;정렬된 엔트리를 메트로놈 소리와 함께 재생해 줘요. 발성 타이밍이 올바른지 확인할 수 있습니다. 셋파람의 utterance timing (F8)과 비슷한 기능이에요. 

### 플러그인 개발에 관하여

&nbsp;플러그인 개발은 늘 환영합니다. 플러그인을 만들었다면, 그 어디든 배포해도 좋아요. 혹은 풀 리퀘스트를 통해 내장 플러그인으로 만들 수도 있습니다.<br>
&nbsp;자세한 사항이 궁금하다면, [vLabeler 플러그인 개발(영문)](../docs/plugin-development.md) 을 읽어 주세요.

<br>

## 로그

&nbsp;`도움말` -> `로그 폴더 열기`에서 로그 파일을 볼 수 있어요. 개발/디버그/테스트 목적으로 활용 가능합니다.

&nbsp;이슈 제보 시, 꼭 최근 로그 파일들을 첨부해 주세요.


<br>

## 앱 사용 기록 추적

&nbsp;[앱 사용 기록 추적(영문)](../readme/tracking.md)에서 자세한 내용을 확인할 수 있어요.

<br>

## 알려진 이슈들

1. &nbsp;현재 `단축키` -> `마우스 스크롤 동작`의 `왼쪽/오른쪽으로 캔버스 스크롤` 동작 변경이 불가능해요.
   트랙패드를 사용하고 있을 경우, 해당 페이지의 `다음/이전 엔트리로 이동` 기능을 비활성하는 것을 추천합니다. 비활성 시 트랙패드 입력에 엔트리 탐색 동작이 일어나는 것을 막고, 트랙패드 입력으로 캔버스를 스크롤할 수 있게 되요.

2. &nbsp;리눅스에서, 파일 탐색기가 빈 폴더를 선택할 수 없는 이슈가 있어요. 경로 복사 + 붙여넣기를 통해 폴더를 선택하거나, 폴더 내에 아무런 파일을 만들어 넣어 주세요.

3. &nbsp;리눅스에서, 가끔 메모리 최적화가 올바르게 이루어지지 않을 때가 있어요. `도구` -> `메모리 최적화`에서 강제로 메모리를 최적화할 수 있습니다.
4. &nbsp;가끔 메인 창이 멈출 수 있습니다. 창의 크기를 변경해 새로고침해 주세요. 
5. &nbsp;메뉴 바를 제외한 모든 텍스트들이 보이지 않는다면, 환경 변수의 `SKIKO_RENDER_API`를 `SOFTWARE`로 변경해 주세요.
6. &nbsp;몇몇 리눅스 배포판에서 파일 탐색기가 올바르게 동작하지 않을 수 있습니다.  `설정` -> `환경설정` -> `기타`에서 커스텀 파일 탐색기를 활성화해 주세요. 커스텀 파일 탐색기는 시스템 파일 탐색기보다 성능이 제한적이라는 점을 유의하세요.

### 현지화에 도움을 주신 분들 (코드 기여자 이외)

[時雨ゆん](https://twitter.com/Yun_Shigure)

[빈빈](https://x.com/2xxbin)