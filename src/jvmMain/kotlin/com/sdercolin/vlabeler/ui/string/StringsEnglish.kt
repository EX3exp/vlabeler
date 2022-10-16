package com.sdercolin.vlabeler.ui.string

import com.sdercolin.vlabeler.ui.string.Strings.*

fun Strings.en(): String = when (this) {
    AppName -> "vLabeler"
    MenuFile -> "File"
    MenuFileNewProject -> "New Project..."
    MenuFileOpen -> "Open..."
    MenuFileOpenRecent -> "Open Recent"
    MenuFileOpenRecentClear -> "Clear Recently Opened"
    MenuFileSave -> "Save"
    MenuFileSaveAs -> "Save As..."
    MenuFileExport -> "Export..."
    MenuFileExportOverwrite -> "Export Overwriting"
    MenuFileExportOverwriteAll -> "Export Overwriting All"
    MenuFileInvalidateCaches -> "Invalidate Caches"
    MenuFileClose -> "Close"
    MenuEdit -> "Edit"
    MenuEditUndo -> "Undo"
    MenuEditRedo -> "Redo"
    MenuEditTools -> "Tools"
    MenuEditToolsCursor -> "Cursor"
    MenuEditToolsScissors -> "Scissors"
    MenuEditToolsPan -> "Pan"
    MenuEditRenameEntry -> "Rename Current Entry..."
    MenuEditDuplicateEntry -> "Duplicate Current Entry..."
    MenuEditRemoveEntry -> "Remove Current Entry"
    MenuEditToggleDone -> "Toggle Done for Current Entry"
    MenuEditToggleStar -> "Toggle Starred for Current Entry"
    MenuEditEditTag -> "Edit Tag of Current Entry"
    MenuEditMultipleEditMode -> "Edit All Connected Entries"
    MenuView -> "View"
    MenuViewToggleMarker -> "Show Parameter Controllers"
    MenuViewPinEntryList -> "Pin Entry List"
    MenuViewPinEntryListLocked -> "Lock Splitter for Pinned Entry List"
    MenuViewToggleProperties -> "Show Properties"
    MenuViewToggleToolbox -> "Show Toolbox"
    MenuViewOpenSampleList -> "Sample List"
    MenuNavigate -> "Navigate"
    MenuNavigateOpenLocation -> "Open Locations"
    MenuNavigateOpenLocationRootDirectory -> "Root Sample Directory"
    MenuNavigateOpenLocationModuleDirectory -> "Sample Directory of Current Sub-project"
    MenuNavigateOpenLocationProjectLocation -> "Project File Location"
    MenuNavigateNextEntry -> "Go to Next Entry"
    MenuNavigatePreviousEntry -> "Go to Previous Entry"
    MenuNavigateNextSample -> "Go to Next Sample"
    MenuNavigatePreviousSample -> "Go to Previous Sample"
    MenuNavigateNextModule -> "Go to Next Sub-project"
    MenuNavigatePreviousModule -> "Go to Previous Sub-project"
    MenuNavigateJumpToEntry -> "Go to Entry..."
    MenuNavigateScrollFit -> "Scroll to Show the Current Entry"
    MenuTools -> "Tools"
    MenuToolsBatchEdit -> "Batch Edit"
    MenuToolsBatchEditQuickLaunchManager -> "Slot Settings..."
    MenuToolsBatchEditQuickLaunch -> "Slot %d: %s"
    MenuToolsBatchEditManagePlugins -> "Manage Plugins..."
    MenuToolsPrerender -> "Prerender All Charts..."
    MenuToolsRecycleMemory -> "Recycle Memory"
    MenuSettings -> "Settings"
    MenuSettingsPreferences -> "Preferences..."
    MenuSettingsLabelers -> "Labelers..."
    MenuSettingsTemplatePlugins -> "Template Generators..."
    MenuHelp -> "Help"
    MenuHelpCheckForUpdates -> "Check for Updates..."
    MenuHelpOpenLogDirectory -> "Open Log Directory"
    MenuHelpOpenLatestRelease -> "Open Latest Release"
    MenuHelpOpenGitHub -> "Open GitHub Page"
    MenuHelpJoinDiscord -> "Join Discord"
    MenuHelpAbout -> "About"
    CommonOkay -> "OK"
    CommonApply -> "Apply"
    CommonCancel -> "Cancel"
    CommonYes -> "Yes"
    CommonNo -> "No"
    CommonWarning -> "Warning"
    CommonError -> "Error"
    CommonInputErrorPromptNumber -> "Please enter a number."
    CommonInputErrorPromptInteger -> "Please enter an integer number."
    CommonInputErrorPromptNumberRange -> "Please enter a number between %s and %s."
    CommonInputErrorPromptNumberMin -> "Please enter a number greater than or equal to %s."
    CommonInputErrorPromptNumberMax -> "Please enter a number less than or equal to %s."
    StarterStart -> "Start"
    StarterNewProject -> "New Project..."
    StarterOpen -> "Open..."
    StarterRecent -> "Recent"
    StarterRecentEmpty -> "You have no recent projects."
    StarterRecentDeleted -> "This profile has been removed."
    StarterNewSampleDirectory -> "Sample directory"
    StarterNewWorkingDirectory -> "Project location"
    StarterNewProjectTitle -> "New Project"
    StarterNewProjectName -> "Project name"
    StarterNewProjectNameWarning -> "The project file already exists. Creating the project will overwrite the file."
    StarterNewCacheDirectory -> "Cache directory"
    StarterNewLabeler -> "Labeler"
    StarterNewTemplatePlugin -> "Template generator"
    StarterNewTemplatePluginNone -> "None"
    StarterNewInputFile -> "Input file (.%s)"
    StarterNewInputFilePlaceholder -> "(One would be created if left blank)"
    StarterNewInputFileDisabledByLabeler -> "No input file is required by the selected labeler"
    StarterNewInputFileDisabledByPlugin -> "No input file is required by the selected template generator"
    StarterNewEncoding -> "Encoding"
    StarterNewAutoExport -> "Auto-export"
    StarterNewAutoExportHelp ->
        "Automatically export the project to overwrite the given input file (if not given, " +
            "the default file position defined by labeler) when the project is saved."
    StarterNewWarningSelfConstructedLabelerWithTemplatePlugin ->
        "You are trying to use a template generator with a labeler that manages multiple sub-projects. " +
            "This is dangerous because it may overwrite all your existing label files with the generated entries. " +
            "Please double confirm that the settings meet your needs."
    SampleListIncludedHeader -> "Project sample files"
    SampleListIncludedItemEntryCountSingle -> "%d entry"
    SampleListIncludedItemEntryCountPlural -> "%d entries"
    SampleListExcludedHeader -> "Other sample files"
    SampleListExcludedPlaceholder -> "There are no unreferenced sample files in the sample directory."
    SampleListEntryHeader -> "Entries"
    SampleListEntriesPlaceholderUnselected -> "Select a sample file on the left to show entries bound to it."
    SampleListEntriesPlaceholderNoEntry -> "There are no entries bound to the selected sample file."
    SampleListEntriesPlaceholderNoEntryButton -> "Create Default"
    SampleListJumpToSelectedEntryButton -> "Go to selected entry"
    SampleListOpenSampleDirectoryButton -> "Open sample directory"
    SampleListSampleDirectoryLabel -> "Sample directory: "
    SampleListSampleDirectoryRedirectButton -> "Change sample directory"
    PrerendererModuleText -> "Rendering sub-projects %d/%d..."
    PrerendererModuleTextFinished -> "Rendering sub-projects %d/%d... Done"
    PrerendererSampleText -> "Rendering sample files %d/%d..."
    PrerendererSampleTextFinished -> "Rendering sample files %d/%d... Done"
    PrerendererChartText -> "Rendering charts %d/%d..."
    PrerendererChartTextFinished -> "Rendering charts %d/%d... Done"
    EditorRenderStatusLabel -> "%d/%d Rendering..."
    ChooseSampleDirectoryDialogTitle -> "Choose sample directory"
    ChooseWorkingDirectoryDialogTitle -> "Choose project location directory"
    ChooseCacheDirectoryDialogTitle -> "Choose cache directory"
    ChooseInputFileDialogTitle -> "Choose input file"
    OpenProjectDialogTitle -> "Open project"
    SaveAsProjectDialogTitle -> "Save as project"
    ExportDialogTitle -> "Export"
    SetResolutionDialogDescription -> "Input canvas resolution (points per pixel) for the editor (%d ~ %d)"
    AskIfSaveBeforeOpenDialogDescription ->
        "You have unsaved changes. Do you want to save them before opening a " +
            "new project?"
    AskIfSaveBeforeExportDialogDescription -> "You have unsaved changes. Do you want to save them before exporting?"
    AskIfSaveBeforeCloseDialogDescription ->
        "You have unsaved changes. Do you want to save them before closing the " +
            "current project?"
    AskIfSaveBeforeExitDialogDescription -> "You have unsaved changes. Do you want to save them before exiting?"
    InputEntryNameDialogDescription -> "Rename entry"
    InputEntryNameDuplicateDialogDescription -> "Input name for the new entry"
    InputEntryNameCutFormerDialogDescription -> "Input name for the former entry after cutting"
    InputEntryNameCutLatterDialogDescription -> "Input name for the latter entry after cutting"
    EditEntryNameDialogExistingError -> "The name you input already exists."
    AskIfRemoveEntryDialogDescription -> "Removing current entry..."
    AskIfRemoveEntryLastDialogDescription ->
        "Removing current entry...\n" +
            "This entry is the only one that has reference of the current sample file.\n" +
            "If you need to add an entry on it later, please see menu `View` -> `Sample List`."
    AskIfLoadAutoSavedProjectDialogDescription ->
        "Auto-saved project file found. Do you want to load it? " +
            "The file will be discarded if you opened or created another one."
    AskIfRedirectSampleDirectoryDialogDescription ->
        "The sample directory of this project (%s) is not found. " +
            "Do you want to redirect it to a new directory?"
    PluginDialogTitle -> "vLabeler - Plugin"
    PluginDialogInfoAuthor -> "author: %s"
    PluginDialogInfoVersion -> "version: %d"
    PluginDialogInfoContact -> "Contact author"
    PluginDialogDescriptionMin -> "min: %s"
    PluginDialogDescriptionMax -> "max: %s"
    PluginDialogDescriptionMinMax -> "min: %s, max: %s"
    PluginDialogExecute -> "Execute"
    PluginEntrySelectorTextMatchTypeEquals -> "Equals"
    PluginEntrySelectorTextMatchTypeContains -> "Contains"
    PluginEntrySelectorTextMatchTypeStartsWith -> "Starts with"
    PluginEntrySelectorTextMatchTypeEndsWith -> "Ends with"
    PluginEntrySelectorTextMatchTypeRegex -> "Regex"
    PluginEntrySelectorNumberMatchTypeEquals -> "="
    PluginEntrySelectorNumberMatchTypeGreaterThan -> ">"
    PluginEntrySelectorNumberMatchTypeGreaterThanOrEquals -> ">="
    PluginEntrySelectorNumberMatchTypeLessThan -> "<"
    PluginEntrySelectorNumberMatchTypeLessThanOrEquals -> "<="
    PluginEntrySelectorPreservedSubjectSample -> "Sample name"
    PluginEntrySelectorPreservedSubjectName -> "Entry name"
    PluginEntrySelectorPreservedSubjectTag -> "Tag"
    PluginEntrySelectorPreservedSubjectDone -> "Done"
    PluginEntrySelectorPreservedSubjectStar -> "Starred"
    PluginEntrySelectorComparerValue -> "Input"
    PluginEntrySelectorPreviewSummaryError -> "Invalid input"
    PluginEntrySelectorPreviewSummaryInitializing -> "Initializing..."
    PluginEntrySelectorPreviewSummary -> "Selecting %d/%d"
    PluginEntrySelectorPlaceholder -> "No filters, selecting all entries."
    EditorSubTitleMultiple -> "editing %1\$d entries in sample %2\$s"
    EditorModuleRootNameTitle -> "(Root)"
    FailedToLoadSampleFileError -> "Could not load the sample file.\nIt may not exist or is not a supported format."
    EmptySampleDirectoryException ->
        "Could not create the project because no sample files are found " +
            "in the given sample directory."
    PluginRuntimeUnexpectedException ->
        "An unexpected error occurred during the plugin execution.\n" +
            "Please contact the author for more information."
    InvalidCreatedProjectException ->
        "The created project is not valid.\n" +
            "Please contact the author of the labeler/plugin for more information."
    InvalidOpenedProjectException ->
        "Could not open the project because it contains invalid data.\n" +
            "Please check the error log for more information."
    ProjectParseException ->
        "Could not open the project.\n" +
            "It may be corrupted or created by an incompatible version of vLabeler."
    ProjectUpdateOnSampleException ->
        "Could not update the project with the loaded sample file." +
            "\nPlease check the error log for more information."
    InvalidEditedProjectException -> "Invalid edited project.\nPlease check error log for more information."
    CustomizableItemLoadingException -> "Could not load the selected customized item."
    PluginRuntimeExceptionTemplate -> "Plugin runtime error: %s"
    LabelerManagerTitle -> "Labelers"
    LabelerManagerImportDialogTitle -> "Import labeler"
    TemplatePluginManagerTitle -> "Template generators"
    TemplatePluginManagerImportDialogTitle -> "Import template generator"
    MacroPluginManagerTitle -> "Batch Edit Plugins"
    MacroPluginManagerImportDialogTitle -> "Import batch edit plugin"
    MacroPluginReportDialogTitle -> "Batch edit execution result"
    MacroPluginReportDialogCopy -> "Copy"
    CustomizableItemManagerRemoveItemConfirm ->
        "Are you sure you want to remove \"%s\"? " +
            "This will remove the file(s) from the disk."
    CustomizableItemManagerOpenDirectory -> "Open directory"
    CustomizableItemManagerReload -> "Reload list"
    CustomizableItemManagerLockedDescription -> "This item is built-in and cannot be removed."
    PreferencesEditorImport -> "Import"
    PreferencesEditorImportDialogTitle -> "Import preferences"
    PreferencesEditorImportSuccess -> "Successfully imported preferences."
    PreferencesEditorImportFailure -> "Failed to import the selected preferences file."
    PreferencesEditorExport -> "Export"
    PreferencesEditorExportSuccess -> "Successfully exported preferences."
    PreferencesEditorExportFailure -> "Failed to export preferences to the selected file."
    PreferencesEditorExportDialogTitle -> "Export preferences"
    PreferencesEditorResetPage -> "Reset items in this page"
    PreferencesEditorResetAll -> "Reset all items"
    PreferencesCharts -> "Charts"
    PreferencesChartsDescription -> "Customize the charts being rendered in the editor."
    PreferencesChartsCanvas -> "Canvas"
    PreferencesChartsCanvasDescription -> "Customize general settings about the canvas where the charts are drawn."
    PreferencesChartsCanvasResolution -> "Canvas resolution"
    PreferencesChartsCanvasResolutionDescription ->
        "Defined as the number of sample points included in 1 pixel.\n" +
            "The bigger the number, the longer time duration the charts show on your screen."
    PreferencesChartsCanvasResolutionDefault -> "Default resolution"
    PreferencesChartsCanvasResolutionStep -> "Step"
    PreferencesChartsMaxDataChunkSize -> "Max data chunk size"
    PreferencesChartsMaxDataChunkSizeDescription ->
        "Max frames that will be included in a chart chunk.\n" +
            "The bigger the number, the fewer parts your charts will be divided into during rendering."
    PreferencesChartsWaveform -> "Waveform"
    PreferencesChartsWaveformDescription -> "Customize the waveform chart."
    PreferencesChartsWaveformResampleDownTo -> "Maximum sample rate (Hz)"
    PreferencesChartsWaveformResampleDownToDescription ->
        "Audio file with a higher sample rate " +
            "will be resampled down to the given value (the files are not edited.)\n" +
            "Set to 0 to disable resampling."
    PreferencesChartsWaveformNormalize -> "Normalize audio"
    PreferencesChartsWaveformNormalizeDescription ->
        "Normalization takes extra time when loading samples for the first time."
    PreferencesChartsWaveformUnitSize -> "Points per pixel"
    PreferencesChartsWaveformUnitSizeDescription -> "Increase for lower image quality."
    PreferencesChartsWaveformIntensityAccuracy -> "Bitmap height (px)"
    PreferencesChartsWaveformYAxisBlankRate -> "Vertical padding (%%)"
    PreferencesChartsWaveformColor -> "Color"
    PreferencesChartsWaveformBackgroundColor -> "Background color"
    PreferencesChartsSpectrogram -> "Spectrogram"
    PreferencesChartsSpectrogramDescription -> "Customize the spectrogram chart."
    PreferencesChartsSpectrogramEnabled -> "Show spectrogram"
    PreferencesChartsSpectrogramHeight -> "Height relative to waveforms (%%)"
    PreferencesChartsSpectrogramPointDensity -> "Points per pixel"
    PreferencesChartsSpectrogramPointDensityDescription -> "Increase for lower image quality."
    PreferencesChartsSpectrogramHopSize -> "FFT hop size"
    PreferencesChartsSpectrogramHopSizeDescription -> "Adapted to the actual sample rate."
    PreferencesChartsSpectrogramWindowSize -> "Window size"
    PreferencesChartsSpectrogramWindowSizeDescription -> "Adapted to the actual sample rate."
    PreferencesChartsSpectrogramMelScaleStep -> "Frequency resolution (mel)"
    PreferencesChartsSpectrogramMaxFrequency -> "Max frequency displayed (Hz)"
    PreferencesChartsSpectrogramMinIntensity -> "Min intensity displayed (dB)"
    PreferencesChartsSpectrogramMaxIntensity -> "Max intensity displayed (dB)"
    PreferencesChartsSpectrogramWindowType -> "Window function"
    PreferencesChartsSpectrogramColorPalette -> "Colors"
    PreferencesKeymap -> "Keymap"
    PreferencesKeymapDescription -> "Customize key bindings for key/mouse actions."
    PreferencesKeymapKeyAction -> "Key actions"
    PreferencesKeymapKeyActionDescription -> "Customize key bindings for key actions."
    PreferencesKeymapMouseClickAction -> "Mouse click actions"
    PreferencesKeymapMouseClickActionDescription ->
        "Customize key bindings for mouse click actions.\n" +
            "An action is conducted only while all the keys in the key bindings are pressed."
    PreferencesKeymapMouseScrollAction -> "Mouse scroll actions"
    PreferencesKeymapMouseScrollActionDescription ->
        "Customize key bindings for mouse scroll actions.\n" +
            "An action is conducted only while all the keys in the key bindings are pressed."
    PreferencesKeymapEditDialogTitle -> "Editing key bind for:"
    PreferencesKeymapEditDialogDescriptionMouseClick ->
        "Left/Right click on the text field with other " +
            "keys pressed to input a shortcut."
    PreferencesKeymapEditDialogDescriptionMouseScroll ->
        "Scroll mouse wheel on the text field with other " +
            "keys pressed to input a shortcut."
    PreferencesKeymapEditDialogConflictingLabel -> "Already assigned to:"
    PreferencesKeymapEditDialogConflictingWarning ->
        "This shortcut is already assigned to other actions.\n" +
            "Do you want to remove the other assignments?"
    PreferencesKeymapEditDialogConflictingWarningKeep -> "Keep"
    PreferencesKeymapEditDialogConflictingWarningRemove -> "Remove"
    PreferencesView -> "View"
    PreferencesViewDescription -> "Customize view appearances"
    PreferencesViewLanguage -> "Language"
    PreferencesViewHideSampleExtension -> "Hide sample file extension"
    PreferencesViewAppAccentColor -> "Accent color (light) of the app"
    PreferencesViewAppAccentColorVariant -> "Accent color (dark) of the app"
    PreferencesViewPinnedEntryListPosition -> "Position of pinned entry list"
    PreferencesViewPositionLeft -> "Left"
    PreferencesViewPositionRight -> "Right"
    PreferencesViewPositionTop -> "Top"
    PreferencesViewPositionBottom -> "Bottom"
    PreferencesViewCornerPositionTopLeft -> "Top left"
    PreferencesViewCornerPositionTopRight -> "Top right"
    PreferencesViewCornerPositionBottomLeft -> "Bottom left"
    PreferencesViewCornerPositionBottomRight -> "Bottom right"
    PreferencesFontSizeSmall -> "Small"
    PreferencesFontSizeMedium -> "Medium"
    PreferencesFontSizeLarge -> "Large"
    PreferencesEditor -> "Editor"
    PreferencesEditorDescription -> "Customize the editor's appearance and behavior."
    PreferencesEditorPlayerCursorColor -> "Player cursor color"
    PreferencesEditorPlayerLockedDrag -> "Fixed-drag"
    PreferencesEditorPlayerLockedDragDescription ->
        "Select a condition to enable fixed-drag while you move " +
            "the parameter lines.\n" +
            "When it is enabled, the other parameter lines will be moved accordingly to " +
            "keep relative positions to the parameter you are moving."
    PreferencesEditorPlayerLockedDragUseLabeler -> "Use settings defined by the labeler"
    PreferencesEditorPlayerLockedDragUseStart -> "Fixed-drag at the entry's start"
    PreferencesEditorPlayerLockedDragNever -> "Never do fixed-drag"
    PreferencesEditorNotes -> "Notes"
    PreferencesEditorNotesDescription ->
        "Customize the editor's appearance and behavior about entry " +
            "notes (starred, done, tag)."
    PreferencesEditorShowDone -> "Display \"Done\" status"
    PreferencesEditorAutoDone -> "Automatically set edited entries as \"Done\""
    PreferencesEditorShowStarred -> "Display \"Starred\" status"
    PreferencesEditorShowTag -> "Display tags"
    PreferencesEditorScissors -> "Scissors"
    PreferencesEditorScissorsDescription -> "Customize appearance and behavior of the scissors tool."
    PreferencesEditorScissorsColor -> "Color"
    PreferencesEditorScissorsActionTargetNone -> "None"
    PreferencesEditorScissorsActionTargetFormer -> "The former entry"
    PreferencesEditorScissorsActionTargetLatter -> "The latter entry"
    PreferencesEditorScissorsActionGoTo -> "Go to entry after cutting"
    PreferencesEditorScissorsActionAskForName -> "Rename entry after cutting"
    PreferencesEditorScissorsActionPlay -> "Play audio when cutting"
    PreferencesEditorAutoScroll -> "Auto scroll"
    PreferencesEditorAutoScrollDescription ->
        "Define when the editor will automatically scroll to show " +
            "the current entry."
    PreferencesEditorAutoScrollOnLoadedNewSample -> "When switched to another sample"
    PreferencesEditorAutoScrollOnJumpedToEntry -> "When switched to another entry by absolute index"
    PreferencesEditorAutoScrollOnSwitchedInMultipleEditMode -> "When switched to another entry in multiple edit mode"
    PreferencesEditorAutoScrollOnSwitched -> "When switched to another entry"
    PreferencesEditorContinuousLabelNames -> "Label names (continuous)"
    PreferencesEditorContinuousLabelNamesDescription ->
        "Customize appearance of entry name texts shown in the editor, when using a continuous labeler."
    PreferencesEditorContinuousLabelNamesColor -> "Color"
    PreferencesEditorContinuousLabelNamesSize -> "Size"
    PreferencesEditorContinuousLabelNamesPosition -> "Position"
    PreferencesPlayback -> "Playback"
    PreferencesPlaybackDescription -> "Customize the behavior about audio playback."
    PreferencesPlaybackPlayOnDragging -> "Preview playback"
    PreferencesPlaybackPlayOnDraggingDescription ->
        "When dragging any parameter lines with the keys for \"Preview playback\" (see keymap), " +
            "play the audio range near the cursor."
    PreferencesPlaybackPlayOnDraggingEnabled -> "Enabled"
    PreferencesPlaybackPlayOnDraggingRangeRadiusMillis -> "Radius (ms)"
    PreferencesPlaybackPlayOnDraggingEventQueueSize -> "Retain drag events"
    PreferencesAutoSave -> "Auto save"
    PreferencesAutoSaveDescription -> "Customize the behavior about project auto-save."
    PreferencesAutoSaveTarget -> "Location of auto-saved file"
    PreferencesAutoSaveTargetNone -> "Do not auto-save"
    PreferencesAutoSaveTargetProject -> "Overwrite project file"
    PreferencesAutoSaveTargetRecord -> "Save to temporary file"
    PreferencesAutoSaveIntervalSec -> "Interval (sec)"
    PreferencesHistory -> "Edit history"
    PreferencesHistoryDescription -> "Customize the behavior about edit history (undo/redo)."
    PreferencesHistoryMaxSize -> "Maximum retained size"
    PreferencesHistorySquashIndex -> "Squash index changes"
    PreferencesHistorySquashIndexDescription ->
        "When enabled, index changes (e.g. switch entries) will not be saved " +
            "until the next content change."
    ActionToggleSamplePlayback -> "Toggle Playback of Current Sample"
    ActionToggleEntryPlayback -> "Toggle Playback of Current Entry"
    ActionIncreaseResolution -> "Zoom Out"
    ActionDecreaseResolution -> "Zoom In"
    ActionInputResolution -> "Input Canvas Resolution"
    ActionCancelDialog -> "Close Dialog"
    ActionSetValue1 -> "Set Parameter 1 To Cursor Position"
    ActionSetValue2 -> "Set Parameter 2 To Cursor Position"
    ActionSetValue3 -> "Set Parameter 3 To Cursor Position"
    ActionSetValue4 -> "Set Parameter 4 To Cursor Position"
    ActionSetValue5 -> "Set Parameter 5 To Cursor Position"
    ActionSetValue6 -> "Set Parameter 6 To Cursor Position"
    ActionSetValue7 -> "Set Parameter 7 To Cursor Position"
    ActionSetValue8 -> "Set Parameter 8 To Cursor Position"
    ActionSetValue9 -> "Set Parameter 9 To Cursor Position"
    ActionSetValue10 -> "Set Parameter 10 To Cursor Position"
    ActionQuickLaunch1 -> "Launch Plugin Slot 1"
    ActionQuickLaunch2 -> "Launch Plugin Slot 2"
    ActionQuickLaunch3 -> "Launch Plugin Slot 3"
    ActionQuickLaunch4 -> "Launch Plugin Slot 4"
    ActionQuickLaunch5 -> "Launch Plugin Slot 5"
    ActionQuickLaunch6 -> "Launch Plugin Slot 6"
    ActionQuickLaunch7 -> "Launch Plugin Slot 7"
    ActionQuickLaunch8 -> "Launch Plugin Slot 8"
    ActionMoveParameter -> "Drag Parameter Line"
    ActionMoveParameterWithPlaybackPreview -> "Drag Parameter Line with Playback Preview"
    ActionMoveParameterIgnoringConstraints -> "Drag Parameter Line Ignoring Constraints"
    ActionMoveParameterInvertingLocked -> "Drag Parameter Line with Fixed-drag Settings Inverted"
    ActionPlayAudioSection -> "Play the Clicked Audio Part"
    ActionScrollCanvasLeft -> "Scroll Canvas to Left"
    ActionScrollCanvasRight -> "Scroll Canvas to Right"
    ActionZoomInCanvas -> "Zoom In"
    ActionZoomOutCanvas -> "Zoom Out"
    ActionGoToNextEntry -> "Go to Next Entry"
    ActionGoToPreviousEntry -> "Go to Previous Entry"
    ActionGoToNextSample -> "Go to Next Sample"
    ActionGoToPreviousSample -> "Go to Previous Sample"
    CheckForUpdatesAlreadyUpdated -> "You already have the latest version of vLabeler installed."
    CheckForUpdatesFailure -> "Could not fetch the latest version information."
    UpdaterDialogSummaryDetailsLink -> "Details"
    UpdaterDialogTitle -> "vLabeler - Update"
    UpdaterDialogCurrentVersionLabel -> "Current version: %s"
    UpdaterDialogLatestVersionLabel -> "Latest version: %1\$s (%2\$s)"
    UpdaterDialogStartDownloadButton -> "Download"
    UpdaterDialogIgnoreButton -> "Ignore this version"
    UpdaterDialogDownloadPositionLabel -> "Download location: "
    UpdaterDialogChangeDownloadPositionButton -> "Change"
    UpdaterDialogChooseDownloadPositionDialogTitle -> "Choose download location"
    AboutDialogTitle -> "vLabeler - About"
    AboutDialogCopyInfo -> "Copy info"
    AboutDialogShowLicenses -> "Show licenses"
    LicenseDialogTitle -> "vLabeler - Licenses"
    LicenseDialogLicenses -> "OSS Licenses used in vLabeler"
    LoadProjectWarningLabelerCreated -> "A new labeler `%s` is installed by the project file."
    LoadProjectWarningLabelerUpdated -> "Labeler `%s` is updated to version `%s` by the project file."
    LoadProjectWarningCacheDirReset ->
        "Cannot find or create the cache directory defined in the project file. " +
            "A default cache directory will be used instead."
    FilterStarred -> "Filtering starred entries"
    FilterUnstarred -> "Filtering unstarred entries"
    FilterStarIgnored -> "Not filtered by star"
    FilterDone -> "Filtering done entries"
    FilterUndone -> "Filtering undone entries"
    FilterDoneIgnored -> "Not filtered by done"
    FilterLink -> "Toggle to apply the filters to project navigation"
    FilterLinked -> "Filters applied to project navigation"
    ColorPickerDialogTitle -> "vLabeler - Color Picker"
    QuickLaunchManagerDialogTitle -> "Plugin Slots"
    QuickLaunchManagerDialogDescription ->
        "You can set frequently used batch edit plugins with their parameters to plugin slots " +
            "for quick access. The parameters stored in the plugin slots are independent of each other, " +
            "and do not affect the parameters saved when used normally."
    QuickLaunchManagerDialogHeaderTitle -> "Slot"
    QuickLaunchManagerDialogHeaderPlugin -> "Plugin"
    QuickLaunchManagerDialogHeaderForceAskParams -> "Always ask for parameters"
    QuickLaunchManagerDialogItemTitle -> "Slot %d"
    QuickLaunchManagerDialogOpenKeymap -> "Open keymap"
}
