@file:Suppress("REDUNDANT_ELSE_IN_WHEN")

package com.sdercolin.vlabeler.ui.string

import com.sdercolin.vlabeler.ui.string.Strings.*

fun Strings.ko(): String? = when (this) {
    AppName -> "vLabeler"
    MenuFile -> "파일"
    MenuFileNewProject -> "새 프로젝트..."
    MenuFileOpen -> "열기..."
    MenuFileOpenRecent -> "최근 파일"
    MenuFileOpenRecentClear -> "최근 파일 초기화"
    MenuFileSave -> "저장"
    MenuFileSaveAs -> "다른 이름으로 저장..."
    MenuFileProjectSetting -> "프로젝트 설정..."
    MenuFileImport -> "[불러오기]..."
    MenuFileExport -> "[내보내기]..."
    MenuFileExportOverwrite -> "[내보내기] 덮어씌워서"
    MenuFileExportOverwriteAll -> "[내보내기] 덮어씌워서 (모두)"
    MenuFileInvalidateCaches -> "캐시 정리"
    MenuFileClose -> "닫기"
    MenuEdit -> "편집"
    MenuEditUndo -> "실행 취소"
    MenuEditRedo -> "다시 실행"
    MenuEditTools -> "도구"
    MenuEditToolsCursor -> "화살표"
    MenuEditToolsScissors -> "가위"
    MenuEditToolsPan -> "손바닥"
    MenuEditToolsPlayback -> "재생"
    MenuEditRenameEntry -> "[이름 변경] 현재 엔트리 ..."
    MenuEditDuplicateEntry -> "[복제] 현재 엔트리..."
    MenuEditRemoveEntry -> "[제거] 현재 엔트리"
    MenuEditMoveEntry -> "[옮기기] 현재 엔트리..."
    MenuEditToggleDone -> "\"완료\" 현재 엔트리"
    MenuEditToggleStar -> "\"중요\" 현재 엔트리"
    MenuEditEditTag -> "[편집] 현재 엔트리의 태그"
    MenuEditEditEntryExtra -> "[추가정보 편집] 현재 엔트리"
    MenuEditMultipleEditMode -> "[다중 편집] 연결된 모든 엔트리"
    MenuEditEditModuleExtra -> "[추가정보 편집] 현재 하위 프로젝트"
    MenuView -> "외형"
    MenuViewToggleMarker -> "마커 표시"
    MenuViewPinEntryList -> "엔트리 목록 표시"
    MenuViewPinEntryListLocked -> "엔트리 목록의 너비가 안 변하게"
    MenuViewToggleProperties -> "상세정보 표시"
    MenuViewToggleToolbox -> "도구바 표시"
    MenuViewToggleTimescaleBar -> "시간 눈금자 표시"
    MenuViewOpenSampleList -> "샘플 목록"
    MenuViewVideo -> "관련 영상을"
    MenuViewVideoOff -> "보지 않기"
    MenuViewVideoEmbedded -> "현재 창에서 보기"
    MenuViewVideoNewWindow -> "새 창에서 보기"
    MenuNavigate -> "탐색"
    MenuNavigateOpenLocation -> "탐색기에서 열기"
    MenuNavigateOpenLocationRootDirectory -> "[홈] 샘플 폴더"
    MenuNavigateOpenLocationModuleDirectory -> "[현재 하위 프로젝트] 샘플 폴더"
    MenuNavigateOpenLocationProjectLocation -> "프로젝트 파일"
    MenuNavigateNextEntry -> "다음 엔트리로"
    MenuNavigatePreviousEntry -> "이전 엔트리로"
    MenuNavigateNextSample -> "다음 샘플로"
    MenuNavigatePreviousSample -> "이전 샘플로"
    MenuNavigateJumpToEntry -> "엔트리 이동..."
    MenuNavigateNextModule -> "다음 하위 프로젝트로"
    MenuNavigatePreviousModule -> "이전 하위 프로젝트로"
    MenuNavigateJumpToModule -> "하위 프로젝트 이동..."
    MenuNavigateScrollFit -> "스크롤을 현재 엔트리에 맞추기"
    MenuTools -> "도구"
    MenuToolsBatchEdit -> "일괄 편집"
    MenuToolsBatchEditQuickLaunchManager -> "슬롯 설정..."
    MenuToolsBatchEditQuickLaunch -> "%d번 슬롯: %s"
    MenuToolsBatchEditShowDisabledItems -> "현재 프로젝트에서 사용 불가한 플러그인도 표시"
    MenuToolsBatchEditManagePlugins -> "플러그인 관리..."
    MenuToolsPrerender -> "모든 차트를 사전 렌더..."
    MenuToolsSyncSample -> "모든 값을 샘플의 끝에 상대적이게 변경..."
    MenuToolsRecycleMemory -> "메모리 최적화"
    MenuSettings -> "설정"
    MenuSettingsPreferences -> "환경설정..."
    MenuSettingsLabelers -> "라벨러 목록..."
    MenuSettingsTemplatePlugins -> "템플릿 생성기 목록..."
    MenuSettingsTracking -> "앱 사용 기록 추적..."
    MenuHelp -> "도움말"
    MenuHelpCheckForUpdates -> "업데이트 확인..."
    MenuHelpOpenLogDirectory -> "로그 폴더 열기"
    MenuHelpIncludeInfoLog -> "상세한 로그 활성화"
    MenuHelpOpenHomePage -> "vLabeler 공식 사이트"
    MenuHelpOpenLatestRelease -> "최신 버전 다운로드"
    MenuHelpOpenGitHub -> "깃헙"
    MenuHelpJoinDiscord -> "공식 디스코드 서버(영어)"
    MenuHelpAbout -> "정보"
    CommonOkay -> "확인"
    CommonApply -> "적용"
    CommonCancel -> "취소"
    CommonYes -> "네"
    CommonNo -> "아니요"
    CommonWarning -> "경고"
    CommonError -> "오류"
    CommonDetails -> "상세정보"
    CommonOthers -> "기타"
    CommonPrevious -> "이전"
    CommonNext -> "다음"
    CommonFinish -> "끝내기"
    CommonSelect -> "선택"
    CommonOpen -> "열기"
    CommonSave -> "저장"
    CommonInputErrorPromptNumber -> "숫자를 입력해 주세요."
    CommonInputErrorPromptInteger -> "정수값을 입력해 주세요."
    CommonInputErrorPromptNumberRange -> "%s ~ %s 사이의 숫자를 입력해 주세요."
    CommonInputErrorPromptNumberMin -> "%s보다 크거나 같은 숫자를 입력해 주세요."
    CommonInputErrorPromptNumberMax -> "%s보다 작거나 같은 숫자를 입력해 주세요."
    CommonRootModuleName -> "(홈)"
    StarterStart -> "시작"
    StarterNewProject -> "새 프로젝트..."
    StarterOpen -> "열기..."
    StarterRecent -> "최근 기록"
    StarterRecentEmpty -> "최근에 연 프로젝트가 없네요."
    StarterRecentDeleted -> "제거된 프로젝트 파일이에요."
    StarterNewSampleDirectory -> "샘플 폴더"
    StarterNewWorkingDirectory -> "프로젝트 위치"
    StarterNewProjectTitle -> "새 프로젝트"
    StarterNewProjectName -> "프로젝트 이름"
    StarterNewProjectNameWarning -> "이미 존재하는 프로젝트 파일이에요. 이대로 저장하면 이전의 파일이 덮어씌워져요."
    StarterNewCacheDirectory -> "캐시 폴더"
    StarterNewLabelerCategory -> "카테고리"
    StarterNewLabeler -> "라벨러"
    StarterNewTemplatePlugin -> "템플릿 생성기"
    StarterNewTemplatePluginNone -> "없음"
    StarterNewInputFile -> "입력된 파일 (.%s)"
    StarterNewEncoding -> "인코딩"
    StarterNewAutoExport -> "자동 내보내기"
    StarterNewAutoExportHelp ->
        "프로젝트가 저장되면 주어진 입력 파일을 자동으로 덮어써요(따로 주어진 입력 파일이 없으면, " +
<<<<<<< HEAD
            "라벨러가 정의한 기본 파일을 덮어씁니다)."
    StarterNewWarningSelfConstructedLabelerWithTemplatePlugin ->
        "여러 하위 프로젝트를 관리하는 라벨러로 템플릿 생성기를 사용하려 하고 있어요. " +
=======
        "라벨러가 정의한 기본 파일을 덮어씁니다)."
    StarterNewWarningSelfConstructedLabelerWithTemplatePlugin ->
            "여러 하위 프로젝트를 관리하는 라벨러로 템플릿 생성기를 사용하려 하고 있어요. " +
>>>>>>> 985aadcb01817741b1b0945c89e5d811accda1c6
            "생성된 엔트리들로 모든 라벨 파일들이 덮어씌워질 위험이 있습니다. " +
            "설정에 실수가 없었는지 충분히 검토 후 실행해 주세요."
    StarterNewDirectoryPage -> "폴더 설정"
    StarterNewLabelerPage -> "라벨러 설정"
    StarterNewDataSourcePage -> "데이터 소스 설정"
    StarterNewContentType -> "By..."
    StarterNewContentTypeDefault -> "기본"
    StarterNewContentTypeFile -> "파일"
    StarterNewContentTypePlugin -> "템플릿 생성기"
    StarterNewAdvancedSettings -> "고급 설정"
    SampleListIncludedHeader -> "프로젝트 샘플 파일들"
    SampleListIncludedItemEntryCountSingle -> "엔트리 %d개"
    SampleListIncludedItemEntryCountPlural -> "엔트리 %d개"
    SampleListExcludedHeader -> "기타 샘플 파일들"
    SampleListExcludedPlaceholder -> "샘플 폴더에 미참조 샘플 파일들이 없어요."
    SampleListEntryHeader -> "엔트리들"
    SampleListEntriesPlaceholderUnselected -> "엔트리를 연결하기 위해 왼쪽에서 샘플 파일을 선택해 주세요."
    SampleListEntriesPlaceholderNoEntry -> "선택한 샘플 파일에 연결된 엔트리가 없어요"
    SampleListEntriesPlaceholderNoEntryButton -> "기본 엔트리 생성"
    SampleListCreateDefaultForAllButton -> "모든 미참조 항목에 대해 기본 엔트리 생성"
    SampleListJumpToSelectedEntryButton -> "선택한 엔트리로 이동"
    SampleListOpenSampleDirectoryButton -> "샘플 폴더 열기"
    SampleListCurrentModuleLabel -> "하위 프로젝트: "
    SampleListSampleDirectoryLabel -> "샘플 폴더: "
    SampleListSampleDirectoryRedirectButton -> "샘플 폴더 변경"
    PrerendererModuleText -> "하위 프로젝트 렌더 중이에요 %d/%d..."
    PrerendererModuleTextFinished -> "하위 프로젝트 렌더 중이에요 %d/%d... 완료"
    PrerendererSampleText -> "샘플 파일 렌더 중이에요 %d/%d..."
    PrerendererSampleTextFinished -> "샘플 파일 렌더 중이에요 %d/%d... 완료"
    PrerendererChartText -> "차트 렌더 중이에요 %d/%d..."
    PrerendererChartTextFinished -> "차트 렌더 중이에요 %d/%d... 완료"
    EditorRenderStatusLabel -> "%d/%d 렌더 중이에요..."
    ChooseSampleDirectoryDialogTitle -> "샘플 폴더 선택"
    ChooseWorkingDirectoryDialogTitle -> "프로젝트가 위치한 폴더 선택"
    ChooseCacheDirectoryDialogTitle -> "캐시 폴더 선택"
    ChooseInputFileDialogTitle -> "입력 파일 선택"
    OpenProjectDialogTitle -> "프로젝트 열기"
    SaveAsProjectDialogTitle -> "프로젝트로 저장"
    ImportDialogTitle -> "불러오기"
    ExportDialogTitle -> "내보내기"
    SetResolutionDialogDescription -> "에디터 캔버스의 해상도를 입력해 주세요 (%d ~ %d)"
    SetEntryPropertyDialogDescription ->
<<<<<<< HEAD
        "이 엔트리의 `%s` 값을 입력해 주세요. \n" +
=======
    "이 엔트리의 `%s` 값을 입력해 주세요. \n" +
>>>>>>> 985aadcb01817741b1b0945c89e5d811accda1c6
            "vLabeler는 입력값들을 별다르게 검토하고 있지 않으니, " +
            "이 기능을 실행한 후 데이터 유효성에 이상이 없는지 반드시 확인해 주세요. "
    AskIfSaveBeforeOpenDialogDescription ->
        "저장되지 않은 내용들이 있어요. 새 프로젝트를 열기 전에 " +
            "변경 사항들을 저장할까요? "
    AskIfSaveBeforeExportDialogDescription -> "저장되지 않은 내용들이 있어요. 내보내기 전에 변경 사항들을 저장할까요?"
    AskIfSaveBeforeCloseDialogDescription ->
        "저장되지 않은 내용들이 있어요. 현재 프로젝트를 닫기 전에 " +
            "변경 사항들을 저장할까요?"
    AskIfSaveBeforeExitDialogDescription -> "저장되지 않은 내용들이 있어요. 나가기 전에 변경 사항들을 저장할까요?"
    InputEntryNameDialogDescription -> "엔트리 이름 변경"
    InputEntryNameDuplicateDialogDescription -> "새 엔트리 이름 입력"
    InputEntryNameCutFormerDialogDescription -> "자른 후 이전 엔트리 이름 입력"
    InputEntryNameCutLatterDialogDescription -> "자른 후 다음 엔트리 이름 입력"
    EditEntryNameDialogExistingError -> "이미 존재하는 엔트리 이름이에요."
    EditEntryExtraDialogDescription -> "현재 엔트리의 추가정보 편집"
    EditModuleExtraDialogDescription -> "현재 하위 프로젝트의 추가정보 편집"
<<<<<<< HEAD
    MoveEntryDialogDescription -> "엔트리 \"%1\$s\"의 새로운 인덱스 입력 (%2\$d ~ %3\$d)"
    AskIfRemoveEntryDialogDescription -> "현재 엔트리 삭제 중..."
    AskIfRemoveEntryLastDialogDescription ->
        "현재 엔트리 삭제 중...\n" +
            "이 엔트리는 현재 샘플 파일에서 유일하게 참조되고 있던 엔트리에요.\n" +
            "나중에 이 샘플에 엔트리를 추가하려면, `외형` -> `샘플 목록`을 눌러 주세요."
    AskIfLoadAutoSavedProjectDialogDescription ->
        "자동 저장된 프로젝트 파일을 찾았어요. 불러올까요? " +
            "자동 저장된 임시 파일은 다른 프로젝트를 만들거나 열면 사라지니 주의하세요."
=======
    MoveEntryDialogDescription -> "엔트리 \'%1\$s\'의 새로운 인덱스 입력 (%2\$d ~ %3\$d)"
    AskIfRemoveEntryDialogDescription -> "현재 엔트리 삭제 중..."
    AskIfRemoveEntryLastDialogDescription ->
        "현재 엔트리 삭제 중...\n" +
        "이 엔트리는 현재 샘플 파일에서 유일하게 참조되고 있던 엔트리에요.\n" +
            "나중에 이 샘플에 엔트리를 추가하려면, `외형` -> `샘플 목록`을 눌러 주세요."
    AskIfLoadAutoSavedProjectDialogDescription ->
     "자동 저장된 프로젝트 파일을 찾았어요. 불러올까요? " +
        "자동 저장된 임시 파일은 다른 프로젝트를 만들거나 열면 사라지니 주의하세요."
>>>>>>> 985aadcb01817741b1b0945c89e5d811accda1c6
    AskIfRedirectSampleDirectoryDialogDescription ->
        "현재 하위 프로젝트 (%s) 의 샘플 폴더가 존재하지 않거나, " +
            "필요한 샘플 파일들이 누락된 것 같아요. " +
            "새로운 폴더로 다시 연결할까요?"
    PluginDialogTitle -> "vLabeler - 플러그인"
    PluginDialogInfoAuthor -> "제작자: %s"
    PluginDialogInfoVersion -> "버전: %d"
    PluginDialogInfoContact -> "제작자 연락처"
    PluginDialogDescriptionMin -> "최소: %s"
    PluginDialogDescriptionMax -> "최대: %s"
    PluginDialogDescriptionMinMax -> "최소: %s, 최대: %s"
    PluginDialogExecute -> "실행"
    PluginDialogImportFromSavedParams -> "기본값으로 저장된 파라미터 불러오기"
    PluginDialogImportFromSlot -> "슬롯 %1\$d에서 불러오기: %2\$s"
    PluginDialogEmptySlotName -> "(비어 있어요)"
    PluginDialogImportFromFile -> "파일로 불러오기"
    PluginDialogImportSuccess -> "프리셋을 성공적으로 불러왔어요."
    PluginDialogImportFailure -> "프리셋을 불러오는 데 실패했어요. 현재 항목과 호환되지 않을 확률이 높아요."
    PluginDialogExportToSavedParams -> "기본값으로 파라미터 저장"
    PluginDialogExportToSlot -> "%1\$d번 슬롯에서 파라미터 불러오기: %2\$s"
    PluginDialogExportToFile -> "파일로 파라미터 내보내기"
    PluginDialogExportSuccess -> "프리셋을 성공적으로 내보냈어요."
    PluginDialogExportFailure -> "프리셋 내보내기에 실패했어요."
    PluginEntrySelectorTextMatchTypeEquals -> "다음과 같은"
    PluginEntrySelectorTextMatchTypeContains -> "다음을 포함하는"
    PluginEntrySelectorTextMatchTypeStartsWith -> "다음 값으로 시작하는"
    PluginEntrySelectorTextMatchTypeEndsWith -> "다음 값으로 끝나는"
    PluginEntrySelectorTextMatchTypeRegex -> "정규식"
    PluginEntrySelectorNumberMatchTypeEquals -> "="
    PluginEntrySelectorNumberMatchTypeGreaterThan -> ">"
    PluginEntrySelectorNumberMatchTypeGreaterThanOrEquals -> ">="
    PluginEntrySelectorNumberMatchTypeLessThan -> "<"
    PluginEntrySelectorNumberMatchTypeLessThanOrEquals -> "<="
    PluginEntrySelectorPreservedSubjectSample -> "샘플 이름 (확장자 제외)"
    PluginEntrySelectorPreservedSubjectName -> "엔트리 이름"
    PluginEntrySelectorPreservedSubjectTag -> "태그"
    PluginEntrySelectorPreservedSubjectDone -> "완료"
    PluginEntrySelectorPreservedSubjectStar -> "중요"
    PluginEntrySelectorPreservedSubjectScript -> "표현식"
    PluginEntrySelectorComparerValue -> "입력"
    PluginEntrySelectorPreviewSummaryError -> "잘못된 입력"
    PluginEntrySelectorPreviewSummaryInitializing -> "초기화 중..."
    PluginEntrySelectorPreviewSummary -> "%d/%d 선택 중"
    PluginEntrySelectorPlaceholder -> "필터 없이 모든 엔트리를 선택하고 있어요."
    PluginEntrySelectorExpressionTitle -> "표현식"
    PluginEntrySelectorExpressionDescription ->
<<<<<<< HEAD
        "위에 명시된 필터들을 조합하는 논리 표현식이에요. \n" +
=======
    "위에 명시된 필터들을 조합하는 논리 표현식이에요. \n" +
>>>>>>> 985aadcb01817741b1b0945c89e5d811accda1c6
            "사용 가능한 표기: `and`, `or`, `not`, `xor`, `(`, `)`, `#1`, `#2`, 등..."
    EditorSubTitleMultiple -> "샘플 %2\$의 엔트리 %1\$d개 편집 중 "
    FailedToLoadSampleFileError -> "샘플 파일을 불러오지 못했어요.\n존재하지 않는 파일이거나 지원되지 않는 형식일 수 있어요."
    PluginRuntimeUnexpectedException ->
        "플러그인 실행 도중 예상치 못한 오류가 발생했어요.\n" +
            "자세한 내용은 플러그인 제작자에게 문의해 확인해 주세요."
    InvalidCreatedProjectException ->
<<<<<<< HEAD
        "생성된 프로젝트가 유효하지 않아요. " +
=======
            "생성된 프로젝트가 유효하지 않아요. " +
>>>>>>> 985aadcb01817741b1b0945c89e5d811accda1c6
            "라벨러나 플러그인의 설정이 올바르게 되어 있는지 확인해 주세요. \n" +
            "문제가 지속된다면, 해당 라벨러나 플러그인의 제작자에게 문의해 주세요."
    InvalidOpenedProjectException ->
        "프로젝트를 열지 못했어요. 올바르지 않은 데이터가 포함되어 있는 것 같아요.\n" +
            "자세한 내용은 에러 로그를 통해 확인해 주세요."
    ProjectParseException ->
<<<<<<< HEAD
        "프로젝트를 열지 못했어요.\n" +
=======
    "프로젝트를 열지 못했어요.\n" +
>>>>>>> 985aadcb01817741b1b0945c89e5d811accda1c6
            "손상된 프로젝트거나 호환되지 않는 버전의 vLabeler로 생성된 프로젝트일 수 있어요.\n" +
            "새 프로젝트를 만들고, `파일` -> `[불러오기]...`를 통해 프로젝트를 불러와 주세요."
    ProjectImportException ->
        "파일을 불러오지 못했어요.\n" +
<<<<<<< HEAD
            "올바르지 않은 vLabeler 프로젝트 파일일 확률이 높아요. 자세한 내용은 에러 로그를 통해 확인해 주세요."
    ProjectUpdateOnSampleException ->
        "불러온 샘플 파일로 프로젝트를 업데이트하지 못했어요." +
=======
        "올바르지 않은 vLabeler 프로젝트 파일일 확률이 높아요. 자세한 내용은 에러 로그를 통해 확인해 주세요."
    ProjectUpdateOnSampleException ->
    "불러온 샘플 파일로 프로젝트를 업데이트하지 못했어요." +
>>>>>>> 985aadcb01817741b1b0945c89e5d811accda1c6
            "\n자세한 내용은 에러 로그를 확인해 주세요."
    InvalidEditedProjectException -> "올바르지 않게 편집된 프로젝트에요..\n자세한 내용은 에러 로그를 확인해 주세요."
    CustomizableItemLoadingException -> "선택된 커스텀 항목을 불러오지 못했어요."
    CustomizableItemRemovingException -> "선택된 커스텀 항목을 삭제하지 못했어요."
    PluginRuntimeExceptionTemplate -> "플러그인 런타임 오류: %s"
    ProjectConstructorRuntimeExceptionTemplate -> "프로젝트 구성 도중 라벨러 런타임 오류: %s"
    PropertySetterRuntimeExceptionTemplate -> "항목 설정 도중 라벨러 런타임 오류: %s"
    PropertySetterUnexpectedRuntimeException ->
        "항목을 설정하는 도중 예상치 못한 오류가 발생했어요.\n" +
            "자세한 내용은 라벨러 제작자에게 문의해 확인해 주세요."
    VideoComponentInitializationException ->
<<<<<<< HEAD
        "영상 요소를 초기화하지 못했어요. 이 기능을 사용하려면 기기에 VLC가 설치되어 있어야 해요. " +
            "README의 `Video integration` 부분을 확인해 주세요."
    VideoFileNotFoundExceptionTemplate ->
        "\"%s\" 이름과 일치하고 %s 사이의 확장자를 지닌 영상을 찾지 못했어요."
=======
    "영상 요소를 초기화하지 못했어요. 이 기능을 사용하려면 기기에 VLC가 설치되어 있어야 해요. " +
            "README의 `Video integration` 부분을 확인해 주세요."
    VideoFileNotFoundExceptionTemplate ->
        "\'%s\' 이름과 일치하고 %s 사이의 확장자를 지닌 영상을 찾지 못했어요."
>>>>>>> 985aadcb01817741b1b0945c89e5d811accda1c6
    LabelerManagerTitle -> "라벨러 목록"
    LabelerManagerImportDialogTitle -> "라벨러 불러오기"
    TemplatePluginManagerTitle -> "템플릿 생성기 목록"
    TemplatePluginManagerImportDialogTitle -> "템플릿 생성기 불러오기"
    MacroPluginManagerTitle -> "일괄 편집 플러그인"
    MacroPluginManagerImportDialogTitle -> "일괄 편집 플러그인 불러오기"
    MacroPluginReportDialogTitle -> "일괄 편집 실행 결과"
    MacroPluginReportDialogCopy -> "복사"
    CustomizableItemManagerRemoveItemConfirm ->
<<<<<<< HEAD
        "\"%s\" 항목을 정말로 제거할까요? " +
=======
        "\'%s\' 항목을 정말로 제거할까요? " +
>>>>>>> 985aadcb01817741b1b0945c89e5d811accda1c6
            "해당 파일이 저장장치에서 제거됩니다."
    CustomizableItemManagerOpenDirectory -> "폴더 열기"
    CustomizableItemManagerReload -> "목록 새로고침"
    CustomizableItemManagerLockedDescription -> "기본 항목에 속하는 항목은 삭제할 수 없어요."
    PreferencesEditorImport -> "불러오기"
    PreferencesEditorImportDialogTitle -> "환경설정 불러오기"
    PreferencesEditorImportSuccess -> "환경설정을 성공적으로 불러왔어요."
    PreferencesEditorImportFailure -> "선택된 환경설정 파일을 불러오는 데에 실패했어요."
    PreferencesEditorExport -> "내보내기"
    PreferencesEditorExportSuccess -> "환경설정을 성공적으로 내보냈어요."
    PreferencesEditorExportFailure -> "선택된 환경설정 파일을 내보내는 데에 실패했어요."
    PreferencesEditorExportDialogTitle -> "환경설정 내보내기"
    PreferencesEditorResetPage -> "이 페이지의 항목들 초기화"
    PreferencesEditorResetAll -> "모든 항목 초기화"
    PreferencesCharts -> "차트"
    PreferencesChartsDescription -> "에디터에서 렌더되는 차트를 커스텀합니다."
    PreferencesChartsCanvas -> "캔버스"
    PreferencesChartsCanvasDescription -> "차트가 그려지는 캔버스에 대한 일반 항목들을 커스텀합니다"
    PreferencesChartsCanvasResolution -> "캔버스 해상도"
    PreferencesChartsCanvasResolutionDescription ->
<<<<<<< HEAD
        "1픽셀당 포함된 샘플 포인트들의 숫자로 정의됩니다.\n" +
=======
    "1픽셀당 포함된 샘플 포인트들의 숫자로 정의됩니다.\n" +
>>>>>>> 985aadcb01817741b1b0945c89e5d811accda1c6
            "숫자가 클수록, 차트가 그려지는 속도는 느려져요. "
    PreferencesChartsCanvasResolutionDefault -> "기본 해상도"
    PreferencesChartsCanvasResolutionStep -> "단계"
    PreferencesChartsMaxDataChunkSize -> "데이터의 최대 청크 사이즈"
    PreferencesChartsMaxDataChunkSizeDescription ->
<<<<<<< HEAD
        "차트 청크에 포함될 최대 프레임 수.\n" +
=======
    "차트 청크에 포함될 최대 프레임 수.\n" +
>>>>>>> 985aadcb01817741b1b0945c89e5d811accda1c6
            "숫자가 클수록, 차트가 더 적은 수의 조각으로 나뉘어 렌더됩니다."
    PreferencesChartsWaveform -> "파형"
    PreferencesChartsWaveformDescription -> "파형 차트를 커스텀합니다."
    PreferencesChartsWaveformResampleDownTo -> "최대 샘플 레이트 (Hz)"
    PreferencesChartsWaveformResampleDownToDescription ->
<<<<<<< HEAD
        "더 높은 샘플 레이트의 오디오 파일은 " +
=======
            "더 높은 샘플 레이트의 오디오 파일은 " +
>>>>>>> 985aadcb01817741b1b0945c89e5d811accda1c6
            "주어진 값으로 다운샘플링되어 렌더됩니다(파일은 수정되지 않아요).\n" +
            "다운샘플링을 비활성화하려면 이 항목을 0으로 설정하세요."
    PreferencesChartsWaveformNormalize -> "오디오 노멀라이즈"
    PreferencesChartsWaveformNormalizeDescription ->
<<<<<<< HEAD
        "처음 로드 시, 노멀라이즈에는 시간이 걸립니다.\n" +
=======
            "처음 로드 시, 노멀라이즈에는 시간이 걸립니다.\n" +
>>>>>>> 985aadcb01817741b1b0945c89e5d811accda1c6
            "노멀라이즈는 vLabeler 내에서만 적용되며, 오디오 파일은 수정되지 않아요."
    PreferencesChartsWaveformUnitSize -> "픽셀 당 포인트"
    PreferencesChartsWaveformUnitSizeDescription -> "화질이 낮은 이미지를 원하면 이 수치를 올리세요."
    PreferencesChartsWaveformIntensityAccuracy -> "비트맵 높이 (px)"
    PreferencesChartsWaveformYAxisBlankRate -> "수직 여백 (%%)"
    PreferencesChartsWaveformColor -> "색상"
    PreferencesChartsWaveformBackgroundColor -> "배경 색상"
    PreferencesChartsSpectrogram -> "스펙토그램"
    PreferencesChartsSpectrogramDescription -> "스펙토그램 차트를 커스텀합니다."
    PreferencesChartsSpectrogramEnabled -> "스펙토그램 표시"
    PreferencesChartsSpectrogramHeight -> "파형에 상대적인 높이 (%%)"
    PreferencesChartsSpectrogramPointDensity -> "픽셀 당 포인트"
    PreferencesChartsSpectrogramPointDensityDescription -> "화질이 낮은 이미지를 원하면 이 수치를 올리세요."
    PreferencesChartsSpectrogramHopSize -> "고속 푸리에 변환의 hop size"
    PreferencesChartsSpectrogramHopSizeDescription -> "실제 샘플 레이트에 따라 조정됩니다."
    PreferencesChartsSpectrogramWindowSize -> "윈도우 사이즈"
    PreferencesChartsSpectrogramWindowSizeDescription -> "실제 샘플 레이트에 따라 조정됩니다."
    PreferencesChartsSpectrogramMelScaleStep -> "주파수 해상도 (mel)"
    PreferencesChartsSpectrogramMaxFrequency -> "보여질 최대 주파수 (Hz)"
    PreferencesChartsSpectrogramMinIntensity -> "보여질 최소 강도 (dB)"
    PreferencesChartsSpectrogramMinIntensityInvalid -> "최소 강도는 최대 강도보다 작은 값이어야만 해요."
    PreferencesChartsSpectrogramMaxIntensity -> "보여질 최대 강도 (dB)"
    PreferencesChartsSpectrogramMaxIntensityInvalid -> "최대 강도는 최소 강도보다 큰 값이어야만 해요."
    PreferencesChartsSpectrogramWindowType -> "윈도우 함수"
    PreferencesChartsSpectrogramColorPalette -> "색상"
    PreferencesChartsSpectrogramColorPaletteDescription ->
        "스펙토그램의 색상 팔레트입니다. @edit{이 폴더}에서 본인의 컬러 팔레트들을 추가해 보세요. " +
            "변경사항을 적용하려면 환경설정 창을 다시 열어 주세요."
    PreferencesChartsSpectrogramUseHighAlphaContrast -> "고대비 알파 사용"
    PreferencesChartsSpectrogramUseHighAlphaContrastDescription ->
<<<<<<< HEAD
        "알파 값을 지닌 색상 팔레트들에만 적용됩니다."
=======
    "알파 값을 지닌 색상 팔레트들에만 적용됩니다."
>>>>>>> 985aadcb01817741b1b0945c89e5d811accda1c6
    PreferencesChartsPower -> "파워"
    PreferencesChartsPowerDescription -> "파워 차트를 커스텀합니다."
    PreferencesChartsPowerEnabled -> "파워 차트 표시"
    PreferencesChartsPowerMergeChannels -> "채널 합치기"
    PreferencesChartsPowerHeight -> "파형에 상대적인 높이 (%%)"
    PreferencesChartsPowerUnitSize -> "픽셀 당 포인트"
    PreferencesChartsPowerUnitSizeDescription -> "화질이 낮은 이미지를 원하면 이 수치를 올리세요."
    PreferencesChartsPowerUnitSizeInvalid -> "단위 크기는 윈도우 크기보다 작거나 같아야만 해요."
    PreferencesChartsPowerWindowSize -> "윈도우 크기"
    PreferencesChartsPowerWindowSizeInvalid -> "윈도우 크기는 단위 크기보다 크거나 같아야 해요"
    PreferencesChartsPowerMinPower -> "보여질 최소 파워 (dB)"
    PreferencesChartsPowerMinPowerInvalid -> "최소 파워는 최대 파워보다 작은 값이어야만 해요."
    PreferencesChartsPowerMaxPower -> "보여질 최대 파워 (dB)"
    PreferencesChartsPowerMaxPowerInvalid -> "최대 파워는 최소 파워보다 큰 값이어야만 해요."
    PreferencesChartsPowerIntensityAccuracy -> "비트맵 높이 (px)"
    PreferencesChartsPowerColor -> "색상"
    PreferencesChartsPowerBackgroundColor -> "배경 색상"
    PreferencesChartsConversion -> "지원되는 오디오 형식"
    PreferencesChartsConversionDescription -> "wav 이외에 지원할 오디오 형식들을 지정합니다."
    PreferencesChartsConversionFFmpegPath -> "FFmpeg 실행 경로"
    PreferencesChartsConversionFFmpegPathDescription ->
<<<<<<< HEAD
        "로드 전 형식 변환을 수행하기 위해, @open{FFmpeg}를 설치하고, 실행 경로로 지정해 주세요. " +
=======
            "로드 전 형식 변환을 수행하기 위해, @open{FFmpeg}를 설치하고, 실행 경로로 지정해 주세요. " +
>>>>>>> 985aadcb01817741b1b0945c89e5d811accda1c6
            "설치한 FFmpeg를 vLabeler에서 사용하기 전, 해당 FFmpeg가 OS에서 잘 실행되는지 우선적으로 확인해 주세요. " +
            "오류가 발생할 경우, 서명되지 않은 실행 파일 혹은 접근 권한과 관련되어 있을 확률이 높습니다."
    PreferencesChartsConversionFFmpegArgs -> "입력값과 출력값 이외의 FFmpeg 인수"
    PreferencesChartsConversionFFmpegUseForWav -> "wav 파일들에 FFmpeg 변환 사용"
    PreferencesKeymap -> "단축키"
    PreferencesKeymapDescription -> "키보드/마우스 입력 시 동작을 커스텀합니다."
    PreferencesKeymapKeyAction -> "키보드 입력"
    PreferencesKeymapKeyActionDescription -> "키보드 입력 시 동작을 커스텀합니다."
    PreferencesKeymapMouseClickAction -> "마우스 입력"
    PreferencesKeymapMouseClickActionDescription ->
        "마우스 입력에 대응하는 동작을 커스텀합니다.\n" +
            "동작에 속한 키들이 모두 눌려 있을 경우에만 작업이 실행됩니다."
    PreferencesKeymapMouseScrollAction -> "마우스 스크롤 입력"
    PreferencesKeymapMouseScrollActionDescription ->
        "마우스 스크롤 입력에 대응하는 동작을 커스텀합니다.\n" +
            "동작에 속한 키들이 모두 눌려 있을 경우에만 작업이 실행됩니다."
    PreferencesKeymapEditDialogTitle -> "단축키 편집 중:"
    PreferencesKeymapEditDialogDescriptionMouseClick ->
        "단축키 입력으로 입력된 키들이 눌려 있을 때 " +
            "텍스트 입력 필드의 왼쪽/오른쪽 클릭."
    PreferencesKeymapEditDialogDescriptionMouseScroll ->
        "단축키 입력으로 입력된 키들이 눌려 있을 때 " +
            "텍스트 입력 필드의 마우스 스크롤."
    PreferencesKeymapEditDialogConflictingLabel -> "이미 지정된 단축키:"
    PreferencesKeymapEditDialogConflictingWarning ->
        "이 단축키는 이미 다른 작업에 지정되어 있어요.\n" +
            "다른 작업을 제거할까요?"
    PreferencesKeymapEditDialogConflictingWarningKeep -> "유지"
    PreferencesKeymapEditDialogConflictingWarningRemove -> "제거"
    PreferencesView -> "외형"
    PreferencesViewDescription -> "외관 커스텀"
    PreferencesViewLanguage -> "언어"
    PreferencesViewFontFamily -> "폰트"
    PreferencesViewFontFamilyDescription ->
        "앱에서 사용되는 폰트를 설정합니다.\n" +
            "메뉴의 폰트 외에도,@edit{이 폴더}에 폰트를 추가할 수 있답니다. " +
            "ttc 폰트들은 아직 완전히 지원되고 있지 않습니다. " +
            "ttc 폰트의 모든 스타일을 사용하려면, ttf/otf 파일로 변환해 사용해 주세요.\n" +
            "추가된 폰트는 환경설정 창을 다시 열어야만 반영됩니다."
    PreferencesViewHideSampleExtension -> "샘플 파일 확장자 숨기기"
    PreferencesViewAppAccentColor -> "앱의 강조(밝은 색) 색상"
    PreferencesViewAppAccentColorVariant -> "앱의 강조(어두운 색) 색상"
    PreferencesViewPinnedEntryListPosition -> "엔트리 목록의 위치"
    PreferencesViewPositionLeft -> "왼쪽"
    PreferencesViewPositionRight -> "오른쪽"
    PreferencesViewPositionTop -> "위"
    PreferencesViewPositionBottom -> "아래"
    PreferencesViewCornerPositionTopLeft -> "왼쪽 위"
    PreferencesViewCornerPositionTopRight -> "오른쪽 위"
    PreferencesViewCornerPositionCenterLeft -> "왼쪽 가운데"
    PreferencesViewCornerPositionCenterRight -> "오른쪽 가운데"
    PreferencesViewCornerPositionBottomLeft -> "왼쪽 아래"
    PreferencesViewCornerPositionBottomRight -> "오른쪽 아래"
    PreferencesFontSizeSmall -> "작게"
    PreferencesFontSizeMedium -> "중간"
    PreferencesFontSizeLarge -> "크게"
    PreferencesFontSizeExtraLarge -> "매우 크게"
    PreferencesEditor -> "에디터"
    PreferencesEditorDescription -> "에디터의 외관과 프로그램의 동작을 커스텀합니다."
    PreferencesEditorPlayerCursorColor -> "재생 커서 색상"
    PreferencesEditorLockedDrag -> "고정 드래그"
    PreferencesEditorLockedDragDescription ->
        "마커를 움직일 때, 고정 드래그의 방식을 선택합니다.\n" +
            "고정 드래그 활성화 시, 다른 마커들을 함께 움직여 " +
            "대상 마커와의 상대적인 위치를 유지시킵니다."
    PreferencesEditorLockedDragUseLabeler -> "라벨러에 의해 정의된 설정 사용"
    PreferencesEditorLockedDragUseStart -> "엔트리의 시작부에서 고정 드래그"
    PreferencesEditorLockedDragNever -> "고정 드래그 사용 안함"
    PreferencesEditorLockedSettingParameterWithCursor -> "커서 설정에 따라 고정 드래그 적용"
    PreferencesEditorLockedSettingParameterWithCursorDescription ->
        "\"n번 마커 놓기 (커서 위치에)\" 입력으로 마커를 놓을 경우에도 " +
            "위의 고정 드래그 방식을 적용하기"
    PreferencesEditorNotes -> "엔트리 상태 표기"
    PreferencesEditorNotesDescription ->
        "엔트리의 상태 (중요, 완료, 태그, 추가정보) 에 관한 " +
            "에디터의 외형 및 동작 방식을 커스텀합니다."
    PreferencesEditorShowDone -> "\"완료\" 보이기"
    PreferencesEditorShowStarred -> "\"중요\" 보이기"
    PreferencesEditorShowTag -> "태그 보이기"
    PreferencesEditorShowExtra -> "\"추가정보 편집\" 보이기"
    PreferencesEditorShowExtraDescription ->
        "추가정보가 없는 라벨러일 경우, 버튼은 (해당 설정이 활성화되어 있더라도) 표시되지 않습니다."
    PreferencesEditorPostEditAction -> "사전편집 동작"
    PreferencesEditorPostEditActionDescription -> "엔트리를 편집하고 난 후의 동작을 지정합니다."
    PreferencesEditorPostEditActionDone -> "편집된 엔트리에 자동으로 \"완료\" 표시"
    PreferencesEditorPostEditActionNext -> "편집 후 다음 엔트리로 이동"
    PreferencesEditorPostEditActionEnabled -> "활성화"
    PreferencesEditorPostEditActionTrigger -> "사전편집 동작 기준"
    PreferencesEditorPostEditActionTriggerUseLabeler -> "라벨러에 의해 정의된 설정 사용"
    PreferencesEditorPostEditActionTriggerUseStart -> "엔트리의 시작"
    PreferencesEditorPostEditActionTriggerUseEnd -> "엔트리의 끝"
    PreferencesEditorPostEditActionTriggerUseAny -> "모든 파라미터"
    PreferencesEditorPostEditActionUseDragging -> "마커를 드래그했을 때"
    PreferencesEditorPostEditActionUseDraggingDescription -> "드래그로 마커가 놓여지면 사전편집 동작을 실행합니다."
    PreferencesEditorPostEditActionUseCursorSet -> "\"n번 마커 놓기 (커서 위치에)\" 입력을 사용했을 때"
    PreferencesEditorPostEditActionUseCursorSetDescription ->
        "\"n번 마커 놓기 (커서 위치에)\" 입력으로 마커가 놓여지면 사전편집 동작을 활성화합니다."
    PreferencesEditorScissors -> "가위"
    PreferencesEditorScissorsDescription -> "가위 도구의 외형과 동작 방식을 커스텀합니다."
    PreferencesEditorScissorsUseOnScreenScissors -> "에디터에서 직접 엔트리 이름 작성"
    PreferencesEditorScissorsUseOnScreenScissorsDescription ->
        "가위로 클릭했을 때, 생성된 새 엔트리의 이름을 입력하는 상자를 표시합니다. " +
            "엔터 키를 누르거나 커서를 이동시켜 입력을 확정하고, Esc를 눌러 입력을 취소합니다. " +
            "이 기능은 다중 편집 모드에서만 사용 가능합니다."
    PreferencesEditorScissorsColor -> "색상"
    PreferencesEditorScissorsActionTargetNone -> "미설정"
    PreferencesEditorScissorsActionTargetFormer -> "이전 엔트리로"
    PreferencesEditorScissorsActionTargetLatter -> "다음 엔트리로"
    PreferencesEditorScissorsActionGoTo -> "자른 후 엔트리 이동"
    PreferencesEditorScissorsActionAskForName -> "자른 후 엔트리 이름 변경"
    PreferencesEditorScissorsActionPlay -> "자를 때 오디오 재생"
    PreferencesEditorAutoScroll -> "자동 스크롤"
    PreferencesEditorAutoScrollDescription ->
        "에디터가 스크롤으로 현재 엔트리를 보여 주는 시점을 설정합니다."
    PreferencesEditorAutoScrollOnLoadedNewSample -> "다른 샘플로 전환했을 때"
    PreferencesEditorAutoScrollOnJumpedToEntry -> "다른 엔트리로 이동했을 때 (절대 인덱스 사용)"
    PreferencesEditorAutoScrollOnSwitchedInMultipleEditMode -> "다중 편집 모드에서 다른 엔트리로 전환했을 때"
    PreferencesEditorAutoScrollOnSwitched -> "다른 엔트리로 전환했을 때"
    PreferencesEditorContinuousLabelNames -> "라벨 이름 (연속편집 계열)"
    PreferencesEditorContinuousLabelNamesDescription ->
        "연속편집 계열의 라벨러를 사용할 때, 에디터에 표시될 엔트리 이름들의 외형을 커스텀합니다."
    PreferencesEditorContinuousLabelNamesColor -> "색상"
    PreferencesEditorContinuousLabelNamesBackgroundColor -> "배경 색"
    PreferencesEditorContinuousLabelNamesEditableBackgroundColor -> "배경 색 (편집 시)"
    PreferencesEditorContinuousLabelNamesSize -> "용량"
    PreferencesEditorContinuousLabelNamesPosition -> "위치"
    PreferencesPlayback -> "재생"
    PreferencesPlaybackDescription -> "오디오 재생 동작을 커스텀합니다."
    PreferencesPlaybackPlayOnDragging -> "미리보기 재생"
    PreferencesPlaybackPlayOnDraggingDescription ->
        "\"미리보기 재생\"(단축키 항목 참조)에 설정되어 있는 키를 누른 채" +
            "마커를 드래그하면, 커서 주변 범위에 해당하는 오디오를 재생합니다."
    PreferencesPlaybackPlayOnDraggingEnabled -> "활성화"
    PreferencesPlaybackPlayOnDraggingRangeRadiusMillis -> "범위 반경 (밀리초)"
    PreferencesPlaybackPlayOnDraggingEventQueueSize -> "드래그 이벤트 유지"
    PreferencesAutoSave -> "자동 저장"
    PreferencesAutoSaveDescription -> "프로젝트 자동 저장 동작을 커스텀합니다."
    PreferencesAutoSaveTarget -> "자동 저장 파일의 경로"
    PreferencesAutoSaveTargetNone -> "자동 저장 사용 안함"
    PreferencesAutoSaveTargetProject -> "프로젝트 파일 덮어쓰기"
    PreferencesAutoSaveTargetRecord -> "임시 파일로 저장"
    PreferencesAutoSaveIntervalSec -> "저장 간격 (초)"
    PreferencesHistory -> "편집 기록"
    PreferencesHistoryDescription -> "편집(실행 취소/다시 실행) 동작을 커스텀합니다."
    PreferencesHistoryMaxSize -> "유지할 최대 편집 기록 수"
    PreferencesHistorySquashIndex -> "인덱스 변경 무시"
    PreferencesHistorySquashIndexDescription ->
        "인덱스 변경 (예: 엔트리 전환 등)만 이루어졌을 경우, " +
            "해당 변경사항은 다음 편집 기록 갱신 전까지 편집 기록에 저장되지 않습니다."
    PreferencesMisc -> "기타"
    PreferencesMiscDescription -> "나머지 항목들을 커스텀합니다. 실험적인 항목도 포함되어 있을 수 있으니 조심하세요."
    PreferencesMiscUpdateChannel -> "업데이트 채널"
    PreferencesMiscUpdateChannelDescription ->
        "`도움말` -> `업데이트 확인...`에서 사용될 채널을 설정합니다."
    UpdateChannelStable -> "스테이블"
    UpdateChannelPreview -> "프리뷰"
    PreferencesMiscUseCustomFileDialog -> "커스텀 파일 탐색기를 시스템 파일 탐색기 대신 사용"
    PreferencesMiscUseCustomFileDialogDescription ->
        "활성화할 경우, 대화창에서 사용되는 파일 탐색기가 커스텀 파일 탐색기로 변경됩니다.  " +
            "파일 탐색기 창을 지원하지 않는 환경의 컴퓨터를 사용하고 있다면 활성화하는 것을 추천합니다. " +
            "이 설정을 적용하려면 앱을 재시작해 주세요."
    PreferencesMiscDangerZone -> "위험 구역"
    PreferencesMiscClearRecord -> "앱 사용 기록 초기화"
    PreferencesMiscClearRecordDescription ->
        "창의 크기, 건너뛴 업데이트 버전, 저장된 플러그인 슬롯 등, " +
            "환경설정으로 관리되지 않는 모든 앱 사용 기록을 지웁니다. "
    PreferencesMiscClearRecordButton -> "초기화"
    PreferencesMiscClearRecordConfirmation ->
        "정말로 모든 앱 사용 기록을 초기화하시겠어요?\n" +
            "현재 열린 프로젝트를 저장하지 않은 채로 프로그램이 강제종료됩니다.\n" +
            "돌이킬 수 없는 동작이오니 충분한 검토 후 실행해 주십시오.\n"
    PreferencesMiscClearAppData -> "앱의 모든 데이터 초기화"
    PreferencesMiscClearAppDataDescription ->
        "환경설정, 사용 기록, 설치된 플러그인 등, 앱의 모든 데이터를 지웁니다."
    PreferencesMiscClearAppDataButton -> "모든 데이터 초기화"
    PreferencesMiscClearAppDataConfirmation ->
        "정말로 앱의 모든 데이터를 초기화하시겠어요?\n" +
            "현재 열린 프로젝트를 저장하지 않은 채로 프로그램이 강제종료됩니다.\n" +
            "외부적으로 생성한 파일(프로젝트 관련 파일 등)을 제외한 앱의 모든 데이터가 디바이스에서 지워지며, " +
            "이는 돌이킬 수 없으니 충분한 검토 후 실행해 주십시오.\n"
    ActionToggleSamplePlayback -> "현재 샘플 재생/정지"
    ActionToggleEntryPlayback -> "현재 엔트리 재생/정지"
    ActionToggleScreenRangePlayback -> "현재 화면에 표시되는 영역 재생/정지"
    ActionToggleVideoPopupEmbedded -> "영상 표시/비표시 (현재 창에서)"
    ActionToggleVideoPopupNewWindow -> "영상 표시/비표시 (새 창에서)"
    ActionIncreaseResolution -> "축소"
    ActionDecreaseResolution -> "확대"
    ActionInputResolution -> "캔버스 해상도 입력"
    ActionCancelDialog -> "대화창 닫기"
    ActionScissorsCut -> "자르기 (커서 위치에서)"
    ActionSetValue1 -> "1번 마커 놓기 (커서 위치에)"
    ActionSetValue2 -> "2번 마커 놓기 (커서 위치에)"
    ActionSetValue3 -> "3번 마커 놓기 (커서 위치에)"
    ActionSetValue4 -> "4번 마커 놓기 (커서 위치에)"
    ActionSetValue5 -> "5번 마커 놓기 (커서 위치에)"
    ActionSetValue6 -> "6번 마커 놓기 (커서 위치에)"
    ActionSetValue7 -> "7번 마커 놓기 (커서 위치에)"
    ActionSetValue8 -> "8번 마커 놓기 (커서 위치에)"
    ActionSetValue9 -> "9번 마커 놓기 (커서 위치에)"
    ActionSetValue10 -> "10번 마커 놓기 (커서 위치에)"
    ActionSetProperty1 -> "1번 값 입력"
    ActionSetProperty2 -> "2번 값 입력"
    ActionSetProperty3 -> "3번 값 입력"
    ActionSetProperty4 -> "4번 값 입력"
    ActionSetProperty5 -> "5번 값 입력"
    ActionSetProperty6 -> "6번 값 입력"
    ActionSetProperty7 -> "7번 값 입력"
    ActionSetProperty8 -> "8번 값 입력"
    ActionSetProperty9 -> "9번 값 입력"
    ActionSetProperty10 -> "10번 값 입력"
    ActionQuickLaunch1 -> "1번 플러그인 슬롯 실행"
    ActionQuickLaunch2 -> "2번 플러그인 슬롯 실행"
    ActionQuickLaunch3 -> "3번 플러그인 슬롯 실행"
    ActionQuickLaunch4 -> "4번 플러그인 슬롯 실행"
    ActionQuickLaunch5 -> "5번 플러그인 슬롯 실행"
    ActionQuickLaunch6 -> "6번 플러그인 슬롯 실행"
    ActionQuickLaunch7 -> "7번 플러그인 슬롯 실행"
    ActionQuickLaunch8 -> "8번 플러그인 슬롯 실행"
    ActionMoveParameter -> "마커 드래그"
    ActionMoveParameterWithPlaybackPreview -> "마커 드래그 시 미리보기 재생"
    ActionMoveParameterIgnoringConstraints -> "마커 드래그 시 위치 제약 무시"
    ActionMoveParameterInvertingLocked -> "마커 드래그 시 \"고정 드래그\" 설정 반대로 적용"
    ActionPlayAudioSection -> "클릭된 부분만 재생"
    ActionPlayAudioUntilEnd -> "클릭된 위치 ~ 끝까지 재생"
    ActionPlayAudioUntilScreenEnd -> "클릭된 위치 ~ 현재 화면에 표시된 영역의 끝까지 재생"
    ActionPlayAudioFromStart -> "처음 ~ 클릭된 위치까지 재생"
    ActionPlayAudioFromScreenStart -> "현재 화면에 표시된 영역의 시작 ~ 클릭된 위치까지 재생"
    ActionPlayAudioRange -> "드래그된 범위의 오디오 재생"
    ActionPlayAudioRangeRepeat -> "드래그된 범위의 오디오 재생 (반복)"
    ActionScrollCanvasLeft -> "캔버스 스크롤 (왼쪽으로)"
    ActionScrollCanvasRight -> "캔버스 스크롤 (오른쪽으로)"
    ActionZoomInCanvas -> "확대"
    ActionZoomOutCanvas -> "축소"
    ActionGoToNextEntry -> "다음 엔트리로"
    ActionGoToPreviousEntry -> "이전 엔트리로"
    ActionGoToNextSample -> "다음 샘플으로"
    ActionGoToPreviousSample -> "이전 샘플으로"
    CheckForUpdatesAlreadyUpdated -> "vLabeler가 최신 버전이에요."
    CheckForUpdatesFailure -> "최신 버전의 정보를 가져오지 못했어요."
    UpdaterDialogSummaryDetailsLink -> "상세 정보"
    UpdaterDialogTitle -> "vLabeler - 업데이트"
    UpdaterDialogCurrentVersionLabel -> "현재 버전: %s"
    UpdaterDialogLatestVersionLabel -> "최신 버전: %1\$s (%2\$s)"
    UpdaterDialogStartDownloadButton -> "다운로드"
    UpdaterDialogIgnoreButton -> "이 버전 무시하기"
    UpdaterDialogDownloadPositionLabel -> "다운로드 경로: "
    UpdaterDialogChangeDownloadPositionButton -> "변경"
    UpdaterDialogChooseDownloadPositionDialogTitle -> "다운로드 경로를 선택해 주세요"
    AboutDialogTitle -> "vLabeler - 정보"
    AboutDialogCopyInfo -> "정보 복사"
    AboutDialogShowLicenses -> "라이센스 보기"
    LicenseDialogTitle -> "vLabeler - 라이센스"
    LicenseDialogLicenses -> "vLabeler에 쓰인 OSS 라이센스들"
    LoadProjectErrorLabelerNotFound ->
        "프로젝트가 요구하는 라벨러 `%1\$s` (ver %2\$s)가 기기에 없어요. " +
            "프로젝트를 열기 전, 수동으로 해당 라벨러를 설치해 주세요."
    LoadProjectWarningLabelerCreated -> "프로젝트 파일에 의해 새로운 라벨러 `%s`의 설치를 완료했어요."
    LoadProjectWarningLabelerUpdated -> "프로젝트 파일에 의해 라벨러 `%s`의 `%s` by the project file."
    LoadProjectWarningCacheDirReset ->
        "프로젝트 파일에 정의된 캐시 폴더를 찾지 못했어요. " +
            "기본 캐시 폴더 경로를 대신 사용합니다."
    FilterStarred -> "\"중요\" 엔트리만 표시"
    FilterUnstarred -> "\"중요\" 엔트리만 제외"
    FilterStarIgnored -> "\"중요\" 필터 미적용"
    FilterDone -> "\"완료\" 엔트리만 표시"
    FilterUndone -> "\"완료\" 엔트리만 제외"
    FilterDoneIgnored -> "\"완료\" 필터 미적용"
    FilterLink -> "탐색에 필터 적용"
    FilterLinked -> "탐색에 적용된 필터들"
    ColorPickerDialogTitle -> "vLabeler - 색 팔레트"
    QuickLaunchManagerDialogTitle -> "플러그인 슬롯"
    QuickLaunchManagerDialogDescription ->
        "자주 쓰이는 일괄편집 플러그인과 설정값을 플러그인 슬롯에 넣을 수 있습니다." +
            "플러그인 슬롯에 저장된 설정값들은 상호 독립적이며, " +
            "(정상적으로 사용할 경우) 이미 저장된 설정값들에는 영향이 가지 않아요."
    QuickLaunchManagerDialogHeaderTitle -> "슬롯"
    QuickLaunchManagerDialogHeaderPlugin -> "플러그인"
    QuickLaunchManagerDialogHeaderForceAskParams -> "항상 파라미터를 묻기"
    QuickLaunchManagerDialogItemTitle -> "%d번 슬롯"
    QuickLaunchManagerDialogOpenKeymap -> "단축키 설정 열기"
    TrackingSettingsDialogTitle -> "앱 사용 기록 추적"
    TrackingSettingsDialogDescription ->
        "사용 기록 추적을 켜거나 끌 수 있습니다. 사용 기록 추적을 통해 `앱 기동`, `플러그인 사용`과 같은 사용 이벤트들을 " +
            "익명으로 수집하며, 모인 데이터들은 vLabeler의 개선에 사용됩니다. " +
            "프로젝트 혹은 데이터, 개인정보 등은 전혀 포함되지 않으니 안심하시고, " +
            "부디 이 항목을 활성화해 주셨으면 하는 바람이에요." +
            "자세한 내용은 `상세정보`에서 확인 가능하답니다."
    TrackingSettingsDialogFirstTimeAlert ->
        "사용 기록 추적을 켠 vLabeler를 처음으로 사용하게 되었을 때 보여드리는 창이에요. " +
            "`환경설정` -> `앱 사용 기록 추적...`에서 언제든 설정을 변경할 수 있답니다."
    TrackingSettingsDialogEnabled -> "켜짐"
    TrackingSettingsDialogTrackingIdLabel -> "트래킹 ID:"
    ProjectSettingDialogTitle -> "프로젝트 설정"
    ProjectSettingOutputFileLabel -> "출력 파일"
    ProjectSettingOutputFileHelperText ->
        "`내보내기` 동작의 타겟 파일.\n설정되지 않을 경우, `[내보내기] 덮어씌워서`가 비활성화됩니다."
    ProjectSettingOutputFileDisabledPlaceholder -> "현재 라벨러에 의해 비활성화됨"
    ProjectSettingOutputFileSelectorDialogTitle -> "출력 파일 선택"
    ProjectSettingAutoExportHelperText ->
        "프로젝트를 저장할 때, 모든 하위 프로젝트들을 자동으로 내보냅니다.\n" +
            "`출력 파일`을 올바르게 설정해 두었거나, 라벨러에 의해 `출력 파일`이\n" +
            "고정되었을 경우에만 활성화되요."
    ImportEntriesDialogTitle -> "프로젝트 불러오기"
    ImportEntriesDialogItemSummaryTitle -> "엔트리 총 %d개"
    ImportEntriesDialogItemTargetLabel -> "타겟"
    ImportEntriesDialogItemIncompatible -> "현재 프로젝트와 호환되지 않음"
    ImportEntriesDialogReplaceContent -> "현재 내용 교체"
    ImportEntriesDialogReplaceContentDisabledDescription ->
        "현재 프로젝트에서는 엔트리 추가를 지원하지 않아요. " +
            "불러온 엔트리들로 모든 현재 엔트리들을 대체합니다."
    EntrySampleSyncerModuleText -> "하위 프로젝트 처리 중이에요 %d/%d..."
    EntrySampleSyncerModuleTextFinished -> "하위 프로젝트 처리 중이에요 %d/%d... 완료"
    EntrySampleSyncerSampleText -> "샘플 파일 처리 중이에요 %d/%d..."
    EntrySampleSyncerSampleTextFinished -> "샘플 파일 처리 중이에요 %d/%d... 완료"
    FFmpegConverterException ->
        "샘플 파일 불러오기에 실패했어요. wav 이외의 형식들을 불러오려면, " +
            "FFmpeg를 설치한 후 `환경설정` -> `차트` -> `지원되는 오디오 형식`에서 FFmpeg의 경로를 설정해 주세요. " +
            "이미 FFmpeg 설치와 설정이 끝나 있다면, 로그에서 자세한 정보를 확인해 주세요."
    AppRunningOnCompatibilityModeWarning ->
        "vLabeler가 Rosetta 2 호환 모드로 실행되고 있네요.\n" +
            "더 나은 성능을 위해, 애플 실리콘 (~mac-arm64.dmg) 버전을 다운로드해 사용해 주세요."
    EntryFilterSetterDialogTitle -> "필터 설정"
    EntryFilterSetterDialogHeaderAny -> "다음을 포함하는 모든 텍스트"
    EntryFilterSetterDialogHeaderName -> "다음을 포함하는 엔트리"
    EntryFilterSetterDialogHeaderSample -> "이름에 다음을 포함하는 샘플"
    EntryFilterSetterDialogHeaderTag -> "다음을 포함하는 태그"
    EntryFilterSetterDialogHeaderStar -> "중요"
    EntryFilterSetterDialogHeaderDone -> "완료"
}
