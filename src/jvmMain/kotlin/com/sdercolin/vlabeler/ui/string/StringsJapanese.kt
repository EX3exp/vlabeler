@file:Suppress("REDUNDANT_ELSE_IN_WHEN")

package com.sdercolin.vlabeler.ui.string

import com.sdercolin.vlabeler.ui.string.Strings.*

fun Strings.ja(): String? = when (this) {
    AppName -> "vLabeler"
    MenuFile -> "ファイル"
    MenuFileNewProject -> "新規プロジェクト..."
    MenuFileOpen -> "開く..."
    MenuFileOpenRecent -> "最近開いたプロジェクト"
    MenuFileOpenRecentClear -> "履歴をクリア"
    MenuFileSave -> "保存"
    MenuFileSaveAs -> "名前を付けて保存..."
    MenuFileProjectSetting -> "プロジェクト設定..."
    MenuFileExport -> "エクスポート..."
    MenuFileExportOverwrite -> "上書きエクスポート..."
    MenuFileExportOverwriteAll -> "すべて上書きエクスポート..."
    MenuFileInvalidateCaches -> "キャッシュを無効化"
    MenuFileClose -> "閉じる"
    MenuEdit -> "編集"
    MenuEditUndo -> "取り消し"
    MenuEditRedo -> "やり直し"
    MenuEditTools -> "ツール"
    MenuEditToolsCursor -> "カーソル"
    MenuEditToolsScissors -> "はさみツール"
    MenuEditToolsPan -> "ハンドツール"
    MenuEditRenameEntry -> "このエントリの名前を編集..."
    MenuEditDuplicateEntry -> "このエントリを複製..."
    MenuEditRemoveEntry -> "このエントリを削除..."
    MenuEditMoveEntry -> "このエントリを移動..."
    MenuEditToggleDone -> "このエントリの完了状態を切り替える"
    MenuEditToggleStar -> "このエントリのスターマーク状態を切り替える"
    MenuEditEditTag -> "このエントリのタグを編集..."
    MenuEditMultipleEditMode -> "複数の連続エントリを全て編集"
    MenuView -> "表示"
    MenuViewToggleMarker -> "パラメータマーカーを表示"
    MenuViewPinEntryList -> "エントリリストをピン留め"
    MenuViewPinEntryListLocked -> "エントリリストのボーダーをロックする"
    MenuViewToggleProperties -> "プロパティを表示"
    MenuViewToggleToolbox -> "ツールボックスを表示"
    MenuViewOpenSampleList -> "サンプルリストを開く"
    MenuViewVideo -> "関連動画を表示"
    MenuViewVideoOff -> "オフ"
    MenuViewVideoEmbedded -> "埋め込み"
    MenuViewVideoNewWindow -> "新しいウィンドウで表示"
    MenuNavigate -> "ナビゲート"
    MenuNavigateOpenLocation -> "ディレクトリを開く"
    MenuNavigateOpenLocationRootDirectory -> "ルートサンプルディレクトリ"
    MenuNavigateOpenLocationModuleDirectory -> "現在のサブプロジェクトのサンプルディレクトリ"
    MenuNavigateOpenLocationProjectLocation -> "プロジェクトファイルの場所"
    MenuNavigateNextEntry -> "次のエントリ"
    MenuNavigatePreviousEntry -> "前のエントリ"
    MenuNavigateNextSample -> "次のサンプル"
    MenuNavigatePreviousSample -> "前のサンプル"
    MenuNavigateNextModule -> "次のサブプロジェクト"
    MenuNavigatePreviousModule -> "前のサブプロジェクト"
    MenuNavigateJumpToEntry -> "エントリに移動..."
    MenuNavigateScrollFit -> "このエントリを中央に表示"
    MenuTools -> "ツール"
    MenuToolsBatchEdit -> "一括編集"
    MenuToolsBatchEditQuickLaunchManager -> "スロットの設定..."
    MenuToolsBatchEditQuickLaunch -> "スロット %d：%s"
    MenuToolsBatchEditShowDisabledItems -> "すべてのプラグインを表示"
    MenuToolsBatchEditManagePlugins -> "プラグインマネージャー..."
    MenuToolsPrerender -> "すべてのグラフをプリレンダリング"
    MenuToolsRecycleMemory -> "メモリを解放"
    MenuSettings -> "設定"
    MenuSettingsPreferences -> "環境設定..."
    MenuSettingsLabelers -> "ラベラー..."
    MenuSettingsTemplatePlugins -> "テンプレート生成器..."
    MenuSettingsTracking -> "使用状況のトラッキング..."
    MenuHelp -> "ヘルプ"
    MenuHelpCheckForUpdates -> "アップデートを確認"
    MenuHelpOpenLogDirectory -> "ログディレクトリを開く"
    MenuHelpOpenLatestRelease -> "最新のリリースページを開く"
    MenuHelpOpenGitHub -> "GitHub リポジトリを開く"
    MenuHelpJoinDiscord -> "Discord サーバーに参加"
    MenuHelpAbout -> "vLabeler について"
    CommonOkay -> "OK"
    CommonApply -> "適用"
    CommonCancel -> "キャンセル"
    CommonYes -> "はい"
    CommonNo -> "いいえ"
    CommonWarning -> "警告"
    CommonError -> "エラー"
    CommonDetails -> "詳細"
    CommonOthers -> "その他"
    CommonPrevious -> "前へ"
    CommonNext -> "次へ"
    CommonFinish -> "完了"
    CommonInputErrorPromptNumber -> "数値を入力してください。"
    CommonInputErrorPromptInteger -> "整数を入力してください。"
    CommonInputErrorPromptNumberRange -> "%s から %s の間の数値を入力してください。"
    CommonInputErrorPromptNumberMin -> "%s 以上の数値を入力してください。"
    CommonInputErrorPromptNumberMax -> "%s 以下の数値を入力してください。"
    StarterStart -> "はじめる"
    StarterNewProject -> "新規プロジェクト..."
    StarterOpen -> "開く..."
    StarterRecent -> "最近開いたプロジェクト"
    StarterRecentEmpty -> "最近開いたプロジェクトはありません。"
    StarterRecentDeleted -> "このプロジェクトはすでに削除されています。"
    StarterNewSampleDirectory -> "サンプルディレクトリ"
    StarterNewWorkingDirectory -> "プロジェクトファイルの保存先"
    StarterNewProjectTitle -> "新規プロジェクト"
    StarterNewProjectName -> "プロジェクト名"
    StarterNewProjectNameWarning ->
        "このプロジェクト名はすでに使用されているため、このまま新規プロジェクトを作成すると、既存のプロジェクトが上書きされます。"
    StarterNewCacheDirectory -> "キャッシュディレクトリ"
    StarterNewLabelerCategory -> "カテゴリー"
    StarterNewLabeler -> "ラベラー"
    StarterNewTemplatePlugin -> "テンプレート生成器"
    StarterNewTemplatePluginNone -> "なし"
    StarterNewInputFile -> "入力ファイル (.%s)"
    StarterNewEncoding -> "エンコード"
    StarterNewAutoExport -> "自動エクスポート"
    StarterNewAutoExportHelp ->
        "保存時、自動的にプロジェクトを入力ファイルに上書きエクスポートします。" +
            "入力ファイルが指定されていない場合、ラベラーが指定した場所にエクスポートされます。"
    StarterNewWarningSelfConstructedLabelerWithTemplatePlugin ->
        "複数のサブプロジェクトを扱うラベラーとともに、テンプレート生成器を使用しようとしています。" +
            "これは、すべての既存のラベルファイルを生成されたエントリで上書きする可能性があるため、危険です。" +
            "この設定が必要なものであることを再度確認してください。"
    StarterNewDirectoryPage -> "ディレクトリ設定"
    StarterNewLabelerPage -> "ラベラー設定"
    StarterNewDataSourcePage -> "データソース設定"
    StarterNewContentType -> "ソース"
    StarterNewContentTypeDefault -> "デフォルト"
    StarterNewContentTypeFile -> "ファイル"
    StarterNewContentTypePlugin -> "テンプレート生成器"
    StarterNewAdvancedSettings -> "詳細設定"
    SampleListIncludedHeader -> "使用されているサンプル"
    SampleListIncludedItemEntryCountSingle -> "%d 個のエントリ"
    SampleListIncludedItemEntryCountPlural -> "%d 個のエントリ"
    SampleListExcludedHeader -> "使用されていないサンプル"
    SampleListExcludedPlaceholder -> "使用されていないサンプルはありません。"
    SampleListEntryHeader -> "エントリ"
    SampleListEntriesPlaceholderUnselected -> "左側でサンプルを選択すると、紐付けられているエントリが表示されます。"
    SampleListEntriesPlaceholderNoEntry -> "このサンプルにはエントリが紐付けられていません。"
    SampleListEntriesPlaceholderNoEntryButton -> "エントリを追加"
    SampleListJumpToSelectedEntryButton -> "選択中のエントリに移動"
    SampleListCurrentModuleLabel -> "サブプロジェクト："
    SampleListOpenSampleDirectoryButton -> "サンプルディレクトリを開く"
    SampleListSampleDirectoryLabel -> "サンプルディレクトリ："
    SampleListSampleDirectoryRedirectButton -> "サンプルディレクトリを変更"
    PrerendererModuleText -> "サブプロジェクトをレンダリング中 %d/%d..."
    PrerendererModuleTextFinished -> "サブプロジェクトをレンダリング中 %d/%d... 完了"
    PrerendererSampleText -> "サンプルファイルをレンダリング中 %d/%d..."
    PrerendererSampleTextFinished -> "サンプルファイルをレンダリング中 %d/%d... 完了"
    PrerendererChartText -> "グラフをレンダリング中 %d/%d..."
    PrerendererChartTextFinished -> "グラフをレンダリング中 %d/%d... 完了"
    EditorRenderStatusLabel -> "%d/%d レンダリング中..."
    ChooseSampleDirectoryDialogTitle -> "サンプルディレクトリを選択"
    ChooseWorkingDirectoryDialogTitle -> "プロジェクトファイルの保存先を選択"
    ChooseCacheDirectoryDialogTitle -> "キャッシュディレクトリを選択"
    ChooseInputFileDialogTitle -> "入力ファイルを選択"
    OpenProjectDialogTitle -> "プロジェクトを開く"
    SaveAsProjectDialogTitle -> "プロジェクトを別名で保存"
    ExportDialogTitle -> "プロジェクトをエクスポート"
    SetResolutionDialogDescription -> "エディタのキャンバスの解像度(データポイント/ピクセル)を入力 (%d ~ %d)"
    SetEntryPropertyDialogDescription ->
        "このエントリの属性 %s の値を入力してください。\n入力値は制限されませんので、入力後はデータの正当性を確認してください。"
    AskIfSaveBeforeOpenDialogDescription -> "未保存の変更があります。新しいプロジェクトを開く前に保存しますか？"
    AskIfSaveBeforeExportDialogDescription -> "未保存の変更があります。エクスポートする前に保存しますか？"
    AskIfSaveBeforeCloseDialogDescription -> "未保存の変更があります。プロジェクトを閉じる前に保存しますか？"
    AskIfSaveBeforeExitDialogDescription -> "未保存の変更があります。終了する前に保存しますか？"
    InputEntryNameDialogDescription -> "エントリ名を入力してください"
    InputEntryNameDuplicateDialogDescription -> "新しいエントリ名を入力してください"
    InputEntryNameCutFormerDialogDescription -> "カットで生成する前のエントリの名前を入力してください"
    InputEntryNameCutLatterDialogDescription -> "カットで生成する後のエントリの名前を入力してください"
    EditEntryNameDialogExistingError -> "すでに存在するエントリ名です。"
    MoveEntryDialogDescription -> "エントリ「%1\$s」の新しいインデックスを入力してください (%2\$d ~ %3\$d)"
    AskIfRemoveEntryDialogDescription -> "このエントリを削除します。"
    AskIfRemoveEntryLastDialogDescription ->
        "このエントリを削除します。\n" +
            "このエントリはサンプルに紐付けられている唯一のエントリのため、削除すると、サンプルはプロジェクトから消えますが、" +
            "メニュー「表示」->「サンプルリスト」で確認・再度追加できます。"
    AskIfLoadAutoSavedProjectDialogDescription ->
        "自動保存されたプロジェクトファイルが見つかりました。読み込みますか？" +
            "このファイルは、他のプロジェクトを開く・新規作成するときに削除されます。"
    AskIfRedirectSampleDirectoryDialogDescription ->
        "現在のサブプロジェクトのサンプルディレクトリ(%s)が見つかりません。あるいは、その中にサンプルファイルがありません。" +
            "他のディレクトリに変更しますか？"
    PluginDialogTitle -> "vLabeler - プラグイン"
    PluginDialogInfoAuthor -> "作者：%s"
    PluginDialogInfoVersion -> "バージョン：%d"
    PluginDialogInfoContact -> "作者に連絡"
    PluginDialogDescriptionMin -> "最小値: %s"
    PluginDialogDescriptionMax -> "最大値: %s"
    PluginDialogDescriptionMinMax -> "最小値: %s, 最大値: %s"
    PluginDialogExecute -> "実行"
    PluginDialogImportFromSavedParams -> "保存されたデフォルトパラメータをロード"
    PluginDialogImportFromSlot -> "スロット %1\$d：%2\$s からロード"
    PluginDialogEmptySlotName -> "なし"
    PluginDialogImportFromFile -> "ファイルからインポート"
    PluginDialogImportSuccess -> "プリセットをインポートしました。"
    PluginDialogImportFailure -> "プリセットをインポートできませんでした。互換性のないプリセットである可能性があります。"
    PluginDialogExportToSavedParams -> "デフォルトパラメータとして保存"
    PluginDialogExportToSlot -> "スロット %1\$d：%2\$s に保存"
    PluginDialogExportToFile -> "ファイルにエクスポート"
    PluginDialogExportSuccess -> "プリセットをエクスポートしました。"
    PluginDialogExportFailure -> "プリセットをエクスポートできませんでした。"
    PluginEntrySelectorTextMatchTypeEquals -> "完全一致"
    PluginEntrySelectorTextMatchTypeContains -> "部分一致"
    PluginEntrySelectorTextMatchTypeStartsWith -> "前方一致"
    PluginEntrySelectorTextMatchTypeEndsWith -> "後方一致"
    PluginEntrySelectorTextMatchTypeRegex -> "正規表現"
    PluginEntrySelectorNumberMatchTypeEquals -> "="
    PluginEntrySelectorNumberMatchTypeGreaterThan -> ">"
    PluginEntrySelectorNumberMatchTypeGreaterThanOrEquals -> ">="
    PluginEntrySelectorNumberMatchTypeLessThan -> "<"
    PluginEntrySelectorNumberMatchTypeLessThanOrEquals -> "<="
    PluginEntrySelectorPreservedSubjectSample -> "サンプル名（拡張子なし）"
    PluginEntrySelectorPreservedSubjectName -> "エントリ名"
    PluginEntrySelectorPreservedSubjectTag -> "タグ"
    PluginEntrySelectorPreservedSubjectDone -> "完了状態"
    PluginEntrySelectorPreservedSubjectStar -> "スターマーク状態"
    PluginEntrySelectorComparerValue -> "入力値"
    PluginEntrySelectorPreviewSummaryError -> "無効な入力値"
    PluginEntrySelectorPreviewSummaryInitializing -> "初期化中..."
    PluginEntrySelectorPreviewSummary -> "選択中 %d/%d"
    PluginEntrySelectorPlaceholder -> "フィルターがないため、全てのエントリが選択されます"
    EditorSubTitleMultiple -> "サンプル %2\$s の中の%1\$dエントリを編集"
    EditorModuleRootNameTitle -> "（ルート）"
    FailedToLoadSampleFileError ->
        "サンプルファイルを読み込めませんでした。存在しないか、サポートされていないフォーマットの可能性があります。"
    PluginRuntimeUnexpectedException -> "プラグインの実行中に予期しないエラーが発生しました。プラグインの作者に連絡してください。"
    InvalidCreatedProjectException ->
        "作成したプロジェクトは無効です。お使いのラベラーまたはプラグインのドキュメントに確認し、" +
            "設定してください。問題が解決できない場合は、ラベラーまたはプラグインの作者に連絡してください。"
    InvalidOpenedProjectException -> "プロジェクトを開けませんでした。無効なデータが含まれています。詳細はエラーログを確認してください。"
    ProjectParseException ->
        "プロジェクトを開けませんでした。破損しているか、互換性のないのバージョンの vLabeler によって作られています。"
    ProjectUpdateOnSampleException ->
        "プロジェクトのデータとサンプルのデータをマッチングできませんでした。詳細はエラーログを確認してください。"
    InvalidEditedProjectException -> "この編集は無効です。詳細はエラーログを確認してください。"
    CustomizableItemLoadingException -> "コンポーネントを読み込めませんでした。"
    VideoComponentInitializationException ->
        "ビデオコンポーネントを初期化できませんでした。この機能を使用するには、VLC をインストールする必要があります。" +
            "詳細については、README の `ビデオ表示` セクションを参照してください。"
    VideoFileNotFoundExceptionTemplate ->
        "ファイル名が「%s」で、拡張子が「%s」の動画は見つかりませんでした。"
    PluginRuntimeExceptionTemplate -> "プラグインの実行中にエラーが発生しました：%s"
    LabelerManagerTitle -> "ラベラー"
    LabelerManagerImportDialogTitle -> "ラベラーをインポート"
    TemplatePluginManagerTitle -> "テンプレート生成器"
    TemplatePluginManagerImportDialogTitle -> "テンプレート生成器をインポート"
    MacroPluginManagerTitle -> "一括編集プラグイン"
    MacroPluginManagerImportDialogTitle -> "一括編集プラグインをインポート"
    MacroPluginReportDialogTitle -> "一括編集の実行結果"
    MacroPluginReportDialogCopy -> "コピー"
    CustomizableItemManagerRemoveItemConfirm -> "「%s」を削除しますか？削除されたファイルは元に戻せません。"
    CustomizableItemManagerOpenDirectory -> "ディレクトリを開く"
    CustomizableItemManagerReload -> "再読み込み"
    CustomizableItemManagerLockedDescription -> "このコンポーネントは Built-in のため、削除できません。"
    PreferencesEditorImport -> "インポート"
    PreferencesEditorImportDialogTitle -> "設定をインポート"
    PreferencesEditorImportSuccess -> "設定をインポートしました。"
    PreferencesEditorImportFailure -> "設定をインポートできませんでした。"
    PreferencesEditorExport -> "エクスポート"
    PreferencesEditorExportSuccess -> "設定をエクスポートしました。"
    PreferencesEditorExportFailure -> "指定されたファイルに設定をエクスポートできませんでした。"
    PreferencesEditorExportDialogTitle -> "設定をエクスポート"
    PreferencesEditorResetPage -> "このページの設定をリセット"
    PreferencesEditorResetAll -> "すべての設定をリセット"
    PreferencesCharts -> "グラフ"
    PreferencesChartsDescription -> "グラフの描画・表示をカスタマイズします。"
    PreferencesChartsCanvas -> "キャンバス"
    PreferencesChartsCanvasDescription -> "キャンバスの基本設定をカスタマイズします。"
    PreferencesChartsCanvasResolution -> "キャンバス解像度"
    PreferencesChartsCanvasResolutionDescription ->
        "1ピクセルあたりのデータポイントの数。この値はスクリーンに表示される時間範囲の幅に比例します。"
    PreferencesChartsCanvasResolutionDefault -> "デフォルト値"
    PreferencesChartsCanvasResolutionStep -> "ステップ"
    PreferencesChartsMaxDataChunkSize -> "最大データチャンクサイズ"
    PreferencesChartsMaxDataChunkSizeDescription ->
        "グラフチャンクの最大サイズ。この値が大きいほど、グラフが少ないチャンクに分割されます。"
    PreferencesChartsWaveform -> "波形"
    PreferencesChartsWaveformDescription -> "波形の描画設定をカスタマイズします。"
    PreferencesChartsWaveformResampleDownTo -> "最大サンプリングレート（Hz）"
    PreferencesChartsWaveformResampleDownToDescription ->
        "この値より大きいサンプリングレートの音声ファイルを読み込むときは、" +
            "この値にリサンプリングしてから行います（元のファイルは編集されません）。0に設定すると、リサンプリングは行われません。"
    PreferencesChartsWaveformNormalize -> "音声正規化"
    PreferencesChartsWaveformNormalizeDescription -> "正規化を有効にすると、最初にサンプルを読み込むときに時間がかかります。"
    PreferencesChartsWaveformUnitSize -> "データポイント/ピクセル"
    PreferencesChartsWaveformUnitSizeDescription -> "この値を大きくすると、グラフの描画は高速になりますが、品質は低下します。"
    PreferencesChartsWaveformIntensityAccuracy -> "波形の高さ（ピクセル）"
    PreferencesChartsWaveformYAxisBlankRate -> "縦向きの空白割合（%%）"
    PreferencesChartsWaveformColor -> "波形の色"
    PreferencesChartsWaveformBackgroundColor -> "背景の色"
    PreferencesChartsSpectrogram -> "スペクトログラム"
    PreferencesChartsSpectrogramDescription -> "スペクトログラムの描画設定をカスタマイズします。"
    PreferencesChartsSpectrogramEnabled -> "スペクトログラムを表示"
    PreferencesChartsSpectrogramHeight -> "波形グラフの高さに対する高さの割合（%%）"
    PreferencesChartsSpectrogramPointDensity -> "データポイント/ピクセル"
    PreferencesChartsSpectrogramPointDensityDescription -> "この値を大きくすると、グラフの描画は高速になりますが、品質は低下します。"
    PreferencesChartsSpectrogramHopSize -> "FFT ホップサイズ"
    PreferencesChartsSpectrogramHopSizeDescription ->
        "この設定の値は基準値です。実際の音声ファイルのサンプリングレートによって調整されます。"
    PreferencesChartsSpectrogramWindowSize -> "FFT ウィンドウサイズ"
    PreferencesChartsSpectrogramWindowSizeDescription ->
        "この設定の値は基準値です。実際の音声ファイルのサンプリングレートによって調整されます。"
    PreferencesChartsSpectrogramMelScaleStep -> "周波数ステップ（mel）"
    PreferencesChartsSpectrogramMaxFrequency -> "最高周波数（Hz）"
    PreferencesChartsSpectrogramMinIntensity -> "最小強度（dB）"
    PreferencesChartsSpectrogramMaxIntensity -> "最大強度（dB）"
    PreferencesChartsSpectrogramWindowType -> "ウィンドウ関数"
    PreferencesChartsSpectrogramColorPalette -> "配色"
    PreferencesKeymap -> "ショートカットキー設定"
    PreferencesKeymapDescription -> "キーボード/マウスのショートカットキーをカスタマイズします。"
    PreferencesKeymapKeyAction -> "キーボード"
    PreferencesKeymapKeyActionDescription -> "キーボードのショートカットキーをカスタマイズします。"
    PreferencesKeymapMouseClickAction -> "マウス（クリック）"
    PreferencesKeymapMouseClickActionDescription ->
        "マウスのクリックを組み合わせたショートカットをカスタマイズします。これらの操作は、対応するキーがすべて押されたときに実行されます。"
    PreferencesKeymapMouseScrollAction -> "マウス（スクロール）"
    PreferencesKeymapMouseScrollActionDescription ->
        "マウスのスクロールを組み合わせたショートカットをカスタマイズします。これらの操作は、対応するキーがすべて押されたときに実行されます。"
    PreferencesKeymapEditDialogTitle -> "ショートカットを編集："
    PreferencesKeymapEditDialogDescriptionMouseClick -> "入力欄を選択し、（キー入力+）左クリック/右クリックで入力します。"
    PreferencesKeymapEditDialogDescriptionMouseScroll -> "入力欄を選択し、（キー入力+）マウスホイールで入力します。"
    PreferencesKeymapEditDialogConflictingLabel -> "すでに他の操作で使用されています："
    PreferencesKeymapEditDialogConflictingWarning ->
        "この組み合わせは他の操作で使用されています。重複している操作を削除しますか？"
    PreferencesKeymapEditDialogConflictingWarningKeep -> "削除しない"
    PreferencesKeymapEditDialogConflictingWarningRemove -> "削除する"
    PreferencesView -> "表示"
    PreferencesViewDescription -> "アプリケーションの表示をカスタマイズします。"
    PreferencesViewLanguage -> "言語"
    PreferencesViewHideSampleExtension -> "サンプル名の拡張子を表示しない"
    PreferencesViewAppAccentColor -> "アプリケーションのアクセント色（ライト）"
    PreferencesViewAppAccentColorVariant -> "アプリケーションのアクセント色（ダーク）"
    PreferencesViewPinnedEntryListPosition -> "ピン留めされたエントリリストの位置"
    PreferencesViewPositionLeft -> "左側"
    PreferencesViewPositionRight -> "右側"
    PreferencesViewPositionTop -> "上部"
    PreferencesViewPositionBottom -> "下部"
    PreferencesViewCornerPositionTopLeft -> "左上"
    PreferencesViewCornerPositionTopRight -> "右上"
    PreferencesViewCornerPositionBottomLeft -> "左下"
    PreferencesViewCornerPositionBottomRight -> "右下"
    PreferencesFontSizeSmall -> "小"
    PreferencesFontSizeMedium -> "中"
    PreferencesFontSizeLarge -> "大"
    PreferencesEditor -> "エディタ"
    PreferencesEditorDescription -> "エディタの表示と動作をカスタマイズします。"
    PreferencesEditorPlayerCursorColor -> "再生カーソルの色"
    PreferencesEditorPlayerLockedDrag -> "連動ドラッグ"
    PreferencesEditorPlayerLockedDragDescription ->
        "連動ドラッグを有効にする条件を選択します。" +
            "連動ドラッグを有効にすると、他のパラメータはドラッグするパラメータとの相対位置を保つように移動します。"
    PreferencesEditorPlayerLockedDragUseLabeler -> "ラベラーの設定"
    PreferencesEditorPlayerLockedDragUseStart -> "開始位置をドラッグするとき"
    PreferencesEditorPlayerLockedDragNever -> "有効にしない"
    PreferencesEditorPlayerLockedSettingParameterWithCursor -> "カーソル位置に設定する場合も連動ドラッグを有効にする"
    PreferencesEditorPlayerLockedSettingParameterWithCursorDescription ->
        "「パラメータをカーソル位置に設定」ショートカットでパラメータを設定するときにも、連動ドラッグ設定を適用します。"
    PreferencesEditorNotes -> "備考"
    PreferencesEditorNotesDescription -> "エントリの備考（スターマーク、完了、タグ）に関する表示と動作をカスタマイズします。"
    PreferencesEditorShowDone -> "\"完了\"状態を表示"
    PreferencesEditorAutoDone -> "自動的に編集されたエントリを\"完了\"に設定する"
    PreferencesEditorShowStarred -> "\"スターマーク\"状態を表示"
    PreferencesEditorShowTag -> "タグを表示"
    PreferencesEditorScissors -> "はさみ"
    PreferencesEditorScissorsDescription -> "はさみツールに関する表示と動作をカスタマイズします。"
    PreferencesEditorScissorsColor -> "色"
    PreferencesEditorScissorsActionTargetNone -> "なし"
    PreferencesEditorScissorsActionTargetFormer -> "前のエントリ"
    PreferencesEditorScissorsActionTargetLatter -> "後のエントリ"
    PreferencesEditorScissorsActionGoTo -> "カット後の移動先"
    PreferencesEditorScissorsActionAskForName -> "カット後のリネーム対象"
    PreferencesEditorScissorsActionPlay -> "カット時の再生対象"
    PreferencesEditorAutoScroll -> "自動スクロール"
    PreferencesEditorAutoScrollDescription -> "自動スクロールする条件を選択します。"
    PreferencesEditorAutoScrollOnLoadedNewSample -> "サンプルを切り替えた時"
    PreferencesEditorAutoScrollOnJumpedToEntry -> "インデックスによりエントリに移動した時"
    PreferencesEditorAutoScrollOnSwitchedInMultipleEditMode -> "複数エントリ編集モードでエントリを切り替えた時"
    PreferencesEditorAutoScrollOnSwitched -> "エントリを切り替えた時"
    PreferencesEditorContinuousLabelNames -> "ラベル名（連続）"
    PreferencesEditorContinuousLabelNamesDescription -> "連続のラベラーを使用している時にエディタに表示されるラベル名のスタイルをカスタマイズします。"
    PreferencesEditorContinuousLabelNamesColor -> "色"
    PreferencesEditorContinuousLabelNamesSize -> "サイズ"
    PreferencesEditorContinuousLabelNamesPosition -> "位置"
    PreferencesPlayback -> "再生"
    PreferencesPlaybackDescription -> "音声再生の動作をカスタマイズします。"
    PreferencesPlaybackPlayOnDragging -> "プレビュー再生"
    PreferencesPlaybackPlayOnDraggingDescription ->
        "プレビュー再生の操作（ショートカット参照）でパラメータをドラッグすると、その線の近くの音声をプレビュー再生します。"
    PreferencesPlaybackPlayOnDraggingEnabled -> "有効"
    PreferencesPlaybackPlayOnDraggingRangeRadiusMillis -> "再生範囲の半径（ミリ秒）"
    PreferencesPlaybackPlayOnDraggingEventQueueSize -> "ドラッグイベントのキューサイズ"
    PreferencesAutoSave -> "自動保存"
    PreferencesAutoSaveDescription -> "プロジェクトの自動保存の動作をカスタマイズします。"
    PreferencesAutoSaveTarget -> "保存先"
    PreferencesAutoSaveTargetNone -> "なし"
    PreferencesAutoSaveTargetProject -> "プロジェクトファイルに上書き"
    PreferencesAutoSaveTargetRecord -> "一時ファイル"
    PreferencesAutoSaveIntervalSec -> "間隔（秒）"
    PreferencesHistory -> "操作履歴"
    PreferencesHistoryDescription -> "操作履歴（取り消し、やり直し）に関する動作をカスタマイズします。"
    PreferencesHistoryMaxSize -> "保存される最大操作数"
    PreferencesHistorySquashIndex -> "インデックスのみの変更を圧縮する"
    PreferencesHistorySquashIndexDescription ->
        "有効にすると、インデックスのみの変更（エントリの切り替えなど）は、" +
            "次に内容の変更があるまで、履歴に保存されません。"
    ActionToggleSamplePlayback -> "現在のサンプルの再生/停止"
    ActionToggleEntryPlayback -> "現在のエントリの再生/停止"
    ActionToggleVideoPopupEmbedded -> "ビデオ表示の切り替え（埋め込み）"
    ActionToggleVideoPopupNewWindow -> "ビデオ表示の切り替え（新しいウィンドウ）"
    ActionIncreaseResolution -> "ズームアウト"
    ActionDecreaseResolution -> "ズームイン"
    ActionInputResolution -> "キャンパス解像度を入力"
    ActionCancelDialog -> "ダイアログを閉じる"
    ActionScissorsCut -> "カーソル位置でカット"
    ActionSetValue1 -> "パラメータ1をカーソル位置に設定"
    ActionSetValue2 -> "パラメータ2をカーソル位置に設定"
    ActionSetValue3 -> "パラメータ3をカーソル位置に設定"
    ActionSetValue4 -> "パラメータ4をカーソル位置に設定"
    ActionSetValue5 -> "パラメータ5をカーソル位置に設定"
    ActionSetValue6 -> "パラメータ6をカーソル位置に設定"
    ActionSetValue7 -> "パラメータ7をカーソル位置に設定"
    ActionSetValue8 -> "パラメータ8をカーソル位置に設定"
    ActionSetValue9 -> "パラメータ9をカーソル位置に設定"
    ActionSetValue10 -> "パラメータ10をカーソル位置に設定"
    ActionSetProperty1 -> "プロパティ1の値を入力"
    ActionSetProperty2 -> "プロパティ2の値を入力"
    ActionSetProperty3 -> "プロパティ3の値を入力"
    ActionSetProperty4 -> "プロパティ4の値を入力"
    ActionSetProperty5 -> "プロパティ5の値を入力"
    ActionSetProperty6 -> "プロパティ6の値を入力"
    ActionSetProperty7 -> "プロパティ7の値を入力"
    ActionSetProperty8 -> "プロパティ8の値を入力"
    ActionSetProperty9 -> "プロパティ9の値を入力"
    ActionSetProperty10 -> "プロパティ10の値を入力"
    ActionQuickLaunch1 -> "プラグインスロット1を起動"
    ActionQuickLaunch2 -> "プラグインスロット2を起動"
    ActionQuickLaunch3 -> "プラグインスロット3を起動"
    ActionQuickLaunch4 -> "プラグインスロット4を起動"
    ActionQuickLaunch5 -> "プラグインスロット5を起動"
    ActionQuickLaunch6 -> "プラグインスロット6を起動"
    ActionQuickLaunch7 -> "プラグインスロット7を起動"
    ActionQuickLaunch8 -> "プラグインスロット8を起動"
    ActionMoveParameter -> "パラメータラインをドラッグ"
    ActionMoveParameterWithPlaybackPreview -> "パラメータラインをドラッグ（プレビュー再生）"
    ActionMoveParameterIgnoringConstraints -> "パラメータラインをドラッグ（制約を無視）"
    ActionMoveParameterInvertingLocked -> "パラメータラインをドラッグ（連動ドラグ設定を反転）"
    ActionPlayAudioSection -> "クリック位置の音声を再生"
    ActionScrollCanvasLeft -> "キャンパスを左にスクロール"
    ActionScrollCanvasRight -> "キャンパスを右にスクロール"
    ActionZoomInCanvas -> "ズームイン"
    ActionZoomOutCanvas -> "ズームアウト"
    ActionGoToNextEntry -> "次のエントリ"
    ActionGoToPreviousEntry -> "前のエントリ"
    ActionGoToNextSample -> "次のサンプル"
    ActionGoToPreviousSample -> "前のサンプル"
    CheckForUpdatesAlreadyUpdated -> "すでに最新のバージョンの vLabeler がインストールされています。"
    CheckForUpdatesFailure -> "アップデートの確認に失敗しました。"
    UpdaterDialogSummaryDetailsLink -> "詳細"
    UpdaterDialogTitle -> "vLabeler - アップデートの確認"
    UpdaterDialogCurrentVersionLabel -> "現在のバージョン：%s"
    UpdaterDialogLatestVersionLabel -> "最新のバージョン：%s (%s)"
    UpdaterDialogStartDownloadButton -> "ダウンロード"
    UpdaterDialogIgnoreButton -> "このバージョンを無視"
    UpdaterDialogDownloadPositionLabel -> "保存先："
    UpdaterDialogChangeDownloadPositionButton -> "変更"
    UpdaterDialogChooseDownloadPositionDialogTitle -> "保存先を選択"
    AboutDialogTitle -> "vLabeler について"
    AboutDialogCopyInfo -> "情報をコピー"
    AboutDialogShowLicenses -> "ライセンスを表示"
    LicenseDialogTitle -> "vLabeler - ライセンス"
    LicenseDialogLicenses -> "vLabeler が使用しているライブラリのライセンス"
    LoadProjectWarningLabelerCreated -> "プロジェクトファイルにより新しいラベラー `%s`をインストールしました。"
    LoadProjectWarningLabelerUpdated -> "プロジェクトファイルによりラベラー `%1\$s` を `%2\$s` にアップデートしました。"
    LoadProjectWarningCacheDirReset ->
        "プロジェクトファイルで指定されたキャッシュディレクトリを参照・作成できませんでした。デフォルトのキャッシュディレクトリを使用します。"
    FilterStarred -> "スターマークのあるエントリのみ表示"
    FilterUnstarred -> "スターマークのないエントリのみ表示"
    FilterStarIgnored -> "スターマークでフィルターしない"
    FilterDone -> "完成したエントリのみ表示"
    FilterUndone -> "未完成のエントリのみ表示"
    FilterDoneIgnored -> "完成状態でフィルターしない"
    FilterLink -> "フィルターをプロジェクトのナビゲーションにも使う"
    FilterLinked -> "フィルターはプロジェクトのナビゲーションにも使かわれている"
    ColorPickerDialogTitle -> "vLabeler - カラーピッカー"
    QuickLaunchManagerDialogTitle -> "プラグインスロット"
    QuickLaunchManagerDialogDescription ->
        "よく使う一括編集プラグインをプラグインスロットに登録しておくと、簡単に呼び出すことができます。" +
            "プラグインスロットに登録されたパラメータは、通常のパラメータとは独立し、各自保存されます。"
    QuickLaunchManagerDialogHeaderTitle -> "スロット"
    QuickLaunchManagerDialogHeaderPlugin -> "プラグイン"
    QuickLaunchManagerDialogHeaderForceAskParams -> "パラメータを常に確認"
    QuickLaunchManagerDialogItemTitle -> "スロット %d"
    QuickLaunchManagerDialogOpenKeymap -> "ショートカットの設定を開く"
    TrackingSettingsDialogTitle -> "使用状況のトラッキング"
    TrackingSettingsDialogDescription ->
        "ここでは、匿名の使用状況データの収集を有効/無効にすることができます。" +
            "収集されるデータには、`アプリの起動` や `プラグインの使用` などの使用状況に関するイベントが含まれます。" +
            "収集されるデータは、vLabeler の改善に使用され、プロジェクトやデータ、個人情報に関する特定の情報は含まれません。" +
            "これらのデータが収集されることにご同意いただける場合は、有効にしてください。" +
            "詳細を確認するには、`詳細`ボタンをクリックしてください。"
    TrackingSettingsDialogFirstTimeAlert ->
        "トラッキングをサポートした vLabeler が初めて起動されたため、このダイアログが表示されています。" +
            "このダイアログの中の設定は、メニューの `設定` -> `使用状況のトラッキング...` からいつでも変更することができます。"
    TrackingSettingsDialogEnabled -> "有効"
    TrackingSettingsDialogTrackingIdLabel -> "Tracking ID："
    ProjectSettingDialogTitle -> "プロジェクトの設定"
    ProjectSettingOutputFileLabel -> "出力先ファイル"
    ProjectSettingOutputFileHelperText -> "エクスポートの出力先。未設定の場合、`上書きエクスポート`は無効になります。"
    ProjectSettingOutputFileDisabledPlaceholder -> "このラベラーでは、出力先ファイルは変更できません。"
    ProjectSettingOutputFileSelectorDialogTitle -> "出力先ファイルの選択"
    ProjectSettingAutoExportHelperText ->
        "保存時、自動的にすべてのサブプロジェクトを出力先ファイルに上書きエクスポートします。\n" +
            "この設定は、`出力先ファイル`が正しく設定されている場合、またはラベラーによって固定されている場合のみ有効です。"
    else -> null
}
