/**
 *  Catroid: An on-device visual programming system for Android devices
 *  Copyright (C) 2010-2013 The Catrobat Team
 *  (<http://developer.catrobat.org/credits>)
 *  
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as
 *  published by the Free Software Foundation, either version 3 of the
 *  License, or (at your option) any later version.
 *  
 *  An additional term exception under section 7 of the GNU Affero
 *  General Public License, version 3, is available at
 *  http://developer.catrobat.org/license_additional_term
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  GNU Affero General Public License for more details.
 *  
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.catrobat.catroid.common;

import android.os.Environment;

public final class Constants {

	// Reflection in testcases needed
	// http://stackoverflow.com/questions/1615163/modifying-final-fields-in-java?answertab=votes#tab-top
	public static final float CURRENT_CATROBAT_LANGUAGE_VERSION = Float.valueOf(0.92f);

	public static final String PLATFORM_NAME = "Android";
	public static final int APPLICATION_BUILD_NUMBER = 0; // updated from jenkins nightly/release build
	public static final String APPLICATION_BUILD_NAME = ""; // updated from jenkins nightly/release build
	public static final String PROJECTCODE_NAME = "code.xml";

	public static final String CATROBAT_EXTENSION = ".catrobat";
	public static final String IMAGE_STANDARD_EXTENTION = ".png";
	public static final String TEXT_TO_SPEECH_EXTENSION = ".wav";

	public static final String DEFAULT_ROOT = Environment.getExternalStorageDirectory().getAbsolutePath()
			+ "/Pocket Code";
	public static final String TMP_PATH = DEFAULT_ROOT + "/tmp";
	public static final String TMP_IMAGE_PATH = TMP_PATH + "/PocketPaintImage.tmp";
	public static final String TEXT_TO_SPEECH_TMP_PATH = TMP_PATH + "/textToSpeech";
	public static final String IMAGE_DIRECTORY = "images";
	public static final String SOUND_DIRECTORY = "sounds";
	public static final String BACKPACK_DIRECTORY = "backpack";

	public static final String BACKPACK_SOUND_DIRECTORY = "backpack_sound";
	public static final String BACKPACK_IMAGE_DIRECTORY = "backpack_image";
	public static final String FILENAME_SEPARATOR = "_";

	public static final String NO_MEDIA_FILE = ".nomedia";

	public static final int NO_POSITION = -1;

	//Web:
	public static final String BASE_URL_HTTPS = "https://www.pocketcode.org/";
	public static final String CATROBAT_TERMS_OF_USE_URL = BASE_URL_HTTPS + "termsOfUse";

	public static final String CATROBAT_ABOUT_URL = "http://www.catrobat.org/";
	public static final String ABOUT_POCKETCODE_LICENSE_URL = "http://developer.catrobat.org/licenses";

	public static final String CATROBAT_HELP_URL = "https://www.pocketcode.org/tutorial";

	public static final String TOKEN = "token";
	public static final String NO_TOKEN = "no_token";
	public static final String USERNAME = "username";
	public static final String NO_USERNAME = "no_username";

	// Pocket Paint
	public static final String EXTRA_PICTURE_PATH_POCKET_PAINT = "org.catrobat.extra.PAINTROID_PICTURE_PATH";
	public static final String EXTRA_PICTURE_NAME_POCKET_PAINT = "org.catrobat.extra.PAINTROID_PICTURE_NAME";
	public static final String EXTRA_X_VALUE_POCKET_PAINT = "org.catrobat.extra.PAINTROID_X";
	public static final String EXTRA_Y_VALUE_POCKET_PAINT = "org.catrobat.extra.PAINTROID_Y";
	public static final String POCKET_PAINT_PACKAGE_NAME = "org.catrobat.paintroid";
	public static final String POCKET_PAINT_INTENT_ACTIVITY_NAME = "org.catrobat.paintroid.MainActivity";

	//Various:
	public static final int BUFFER_8K = 8 * 1024;
	public static final String POCKET_PAINT_DOWNLOAD_LINK = "market://details?id=" + POCKET_PAINT_PACKAGE_NAME;
	public static final String PREF_PROJECTNAME_KEY = "projectName";
	public static final String PROJECTNAME_TO_LOAD = "projectNameToLoad";

	//Services + Notifications
	public static final int UPDATE_UPLOAD_PROGRESS = 100;
	public static final int UPDATE_DOWNLOAD_PROGRESS = 101;
	public static final int UPLOAD_NOTIFICATION = 102;
	public static final int DOWNLOAD_NOTIFICATION = 103;
	public static final int COPY_NOTIFICATION = 104;

	// Suppress default constructor for noninstantiability
	private Constants() {
		throw new AssertionError();
	}

	//MainMenuActivity
	public static String UMS_MAIN_MENU_ACTIVITY_NEW = "MainMenuActivity_New";
	public static String UMS_MAIN_MENU_ACTIVITY_CONTINUE = "MainMenuActivity_Continue";
	public static String UMS_MAIN_MENU_ACTIVITY_PROGRAMS = "MainMenuActivity_Programs";
	public static String UMS_MAIN_MENU_ACTIVITY_HELP = "MainMenuActivity_Help";
	public static String UMS_MAIN_MENU_ACTIVITY_EXPLORE = "MainMenuActivity_Explore";
	public static String UMS_MAIN_MENU_ACTIVITY_UPLOAD = "MainMenuActivity_Upload";
	public static String UMS_MAIN_MENU_ACTIVITY_RATE_US = "MainMenuActivity_Rate_Us";
	public static String UMS_MAIN_MENU_ACTIVITY_ABOUT = "MainMenuActivity_About";
	public static String UMS_MAIN_MENU_ACTIVITY_SETTINGS = "MainMenuActivity_Settings";

	//ProjectActivity
	public static String UMS_PROJECT_ACTIVITY_ADD_BUTTON = "ProjectActivityAddButton";
	public static String UMS_PROJECT_ACTIVITY_PLAY_BUTTON = "ProjectActivityPlayButton";
	public static String UMS_PROJECT_ACTIVITY_COPY_MENU = "ProjectActivityCopyMenu";
	public static String UMS_PROJECT_ACTIVITY_RENAME_MENU = "ProjectActivityRenameMenu";
	public static String UMS_PROJECT_ACTIVITY_DELETE_MENU = "ProjectActivityDeleteMenu";
	public static String UMS_PROJECT_ACTIVITY_SHOW_DETAILS_MENU = "ProjectActivityShowDetailsMenu";
	public static String UMS_PROJECT_ACTIVITY_UPLOAD_MENU = "ProjectActivityUploadMenu";

	public static String UMS_PROJECT_ACTIVITY_EDIT_SPRIT = "ProjectActivityEditSprit";

	//MainMenuActivityNewProjectDialog

	public static String UMS_PROJECT_ACTIVITY_NEW_PROJECT_DIALOG_OK_BUTTON = "NewProjectDialogOkButton";
	public static String UMS_PROJECT_ACTIVITY_NEW_PROJECT_DIALOG_CANCEL_BUTTON = "NewProjectDialogCancelButton";
	public static String UMS_PROJECT_ACTIVITY_NEW_PROJECT_DIALOG_CREATE_EMPTY_PROJECT_TRUE = "NewProjectDialogCreateEmptyProjectTrue";
	public static String UMS_PROJECT_ACTIVITY_NEW_PROJECT_DIALOG_CREATE_EMPTY_PROJECT_FALSE = "NewProjectDialogCreateEmptyProjectFalse";

	//MyProjectsActivity +  ProjectsListFragment
	public static String UMS_MY_PROJECTS_ACTIVITY_ADD_BUTTON = "MyProjectsActivityAddButton";
	public static String UMS_MY_PROJECTS_ACTIVITY_PROJECT_SELECTED = "MyProjectsActivityProjectSelected";
	public static String UMS_MY_PROJECTS_ACTIVITY_COPY_MENU = "MyProjectsActivityCopyMenu";
	public static String UMS_MY_PROJECTS_ACTIVITY_RENAME_MENU = "MyProjectsActivityRenameMenu";
	public static String UMS_MY_PROJECTS_ACTIVITY_DELETE_MENU = "MyProjectsActivityDeleteMenu";
	public static String UMS_MY_PROJECTS_ACTIVITY_SHOW_DETAILS_MENU = "MyProjectsActivityShowDetailsMenu";
	public static String UMS_MY_PROJECTS_ACTIVITY_UPLOAD_MENU = "MyProjectsActivityUploadMenu";

	//ProgramMenuActivity
	public static String UMS_PROGRAM_MENU_ACTIVITY_SCRIPTS_BUTTON = "ProgramMenuActivityScriptsButton";
	public static String UMS_PROGRAM_MENU_ACTIVITY_LOOKS_BUTTON = "ProgramMenuActivityLooksButton";
	public static String UMS_PROGRAM_MENU_ACTIVITY_SOUNDS_BUTTON = "ProgramMenuActivitySoundsButton";
	public static String UMS_PROGRAM_MENU_ACTIVITY_PLAY_BUTTON = "ProgramMenuActivityPlayButton";

	//ScriptActivity - Look Fragment

	public static String UMS_SCRIPT_ACTIVITY_LOOK_FRAGMENT_NEW_LOOK_DIALOG = "ScriptActivityLookFragmentNewLookDialogButton";
	public static String UMS_SCRIPT_ACTIVITY_LOOK_FRAGMENT_PLAY_BUTTON = "ScriptActivityLookFragmentPlayButton";
	public static String UMS_SCRIPT_ACTIVITY_LOOK_FRAGMENT_ADD_LOOK_FROM_CAMERA = "ScriptActivityLookFragmentAddLookFromCamera";
	public static String UMS_SCRIPT_ACTIVITY_LOOK_FRAGMENT_DRAW_NEW_IMAGE = "ScriptActivityLookFragmentAddLookDrawNewImage";
	public static String UMS_SCRIPT_ACTIVITY_LOOK_FRAGMENT_EDIT_LOOK = "ScriptActivityLookFragmentAddLookFromCamera";
	public static String UMS_SCRIPT_ACTIVITY_LOOK_FRAGMENT_CHOOSE_IMAGE = "ScriptActivityLookFragmentAddLookChooseImage";

	//ScriptActivity - Sound Fragment

	public static String UMS_SCRIPT_ACTIVITY_SOUND_FRAGMENT_NEW_SOUND_DIALOG = "ScriptActivitySoundFragmentNewSoundDialogButton";
	public static String UMS_SCRIPT_ACTIVITY_SOUND_FRAGMENT_PLAY_Button = "ScriptActivitySoundFragmentPlayButton";
	public static String UMS_SCRIPT_ACTIVITY_SOUND_FRAGMENT_PLAY_SOUND = "ScriptActivitySoundFragmentPlaySound";

	//ScriptActivity - Script Fragment
	public static String UMS_SCRIPT_ACTIVITY_SCRIPT_FRAGMENT_NEW_SCRIPT_BUTTON = "ScriptActivityScriptFragmentNewScriptButton";
	public static String UMS_SCRIPT_ACTIVITY_SCRIPT_FRAGMENT_PLAY_BUTTON = "ScriptActivityScriptFragmentPlayButton";
	//Dialogs

	public static String UMS_DIALOG_ABOUT_DIALOG_OK = "AboutDialogOk";
	public static String UMS_DIALOG_TERMS_OF_USE_OK = "TermsOfUseDialogOk";
	public static String UMS_DIALOG_COPY_PROJECT_DIALOG_OK = "CopyProjectDialogOk";
	public static String UMS_DIALOG_COPY_PROJECT_DIALOG_CANCEL = "CopyProjectDialogCancel";
	public static String UMS_DIALOG_DELETE_LOOK_DIALOG_YES = "DeleteLookDialogYes";
	public static String UMS_DIALOG_DELETE_LOOK_DIALOG_NO = "DeleteLookDialogNo";
	public static String UMS_DIALOG_DELETE_SOUND_DIALOG_YES = "DeleteSoundDialogYes";
	public static String UMS_DIALOG_DELETE_SOUND_DIALOG_NO = "DeleteSoundDialogNo";

	public static String UMS_DIALOG_RENAME_SPRITE_OK = "RenameSpriteDialogOk";
	public static String UMS_DIALOG_RENAME_SPRITE_CANCEL = "RenameSpriteDialogCancel";

	public static String UMS_DIALOG_LOGIN_REGISTER_DIALOG_LOGIN = "LoginRegisterDialogLoginOrRegister";
	public static String UMS_DIALOG_LOGIN_REGISTER_DIALOG_PASSWORD_FORGOTTEN = "LoginRegisterDialogPasswordForgotten";

	public static String UMS_DIALOG_NEW_VARIABLE_DIALOG_OK = "NewVariableDialogOK";
	public static String UMS_DIALOG_NEW_VARIABLE_DIALOG_CANCEL = "NewVariableDialogCancel";
	public static String UMS_DIALOG_NEW_VARIABLE_DIALOG_LOCAL_VARIABLE = "NewVariableDialogForAllObjects";
	public static String UMS_DIALOG_NEW_VARIABLE_DIALOG_GLOBAL_VARIABLE = "NewVariableDialogForThisObjectOnly";

	public static String UMS_DIALOG_OVERWRITE_RENAME_DIALOG_OK = "OverwriteRenameDialogOk";
	public static String UMS_DIALOG_OVERWRITE_RENAME_DIALOG_CANCEL = "OverwriteRenameDialogCancel";

	public static String UMS_DIALOG_RENAME_LOOK_DIALOG_OK = "RenameLookDialogOK";
	public static String UMS_DIALOG_RENAME_LOOK_DIALOG_CANCEL = "RenameLookDialogCancel";

	public static String UMS_DIALOG_RENAME_PROJECT_DIALOG_OK = "RenameProjectDialogOk";
	public static String UMS_DIALOG_RENAME_PROJECT_DIALOG_CANCEL = "RenameProjectDialogCancel";

	public static String UMS_DIALOG_RENAME_SOUND_DIALOG_OK = "RenameSoundDialogOk";
	public static String UMS_DIALOG_RENAME_SOUND_DIALOG_CANCEL = "RenameSoundDialogCancel";

	public static String UMS_DIALOG_RENAME_SPRITE_DIALOG_OK = "RenameSpriteDialogOk";
	public static String UMS_DIALOG_RENAME_SPRITE_DIALOG_CANCEL = "RenameSpriteDialogCancel";

	public static String UMS_DIALOG_SET_DESCRIPTION_DIALOG_OK = "SetDescriptionDialogOk";
	public static String UMS_DIALOG_SET_DESCRIPTION_DIALOG_CANCEL = "SetDescriptionDialogCancel";

	public static String UMS_DIALOG_STAGE_DIALOG_BACK = "StageDialogBack";
	public static String UMS_DIALOG_STAGE_DIALOG_CONTINUE = "StageDialogContinue";
	public static String UMS_DIALOG_STAGE_DIALOG_RESTART = "StageDialogRestart";
	public static String UMS_DIALOG_STAGE_DIALOG_TOGGLE_AXES = "StageDialogToggleAxes";
	public static String UMS_DIALOG_STAGE_DIALOG_MAXIMIZE = "StageDialogMaximize";
	public static String UMS_DIALOG_STAGE_DIALOG_SCREENSHOT = "StageDialogScreenshot";
	public static String UMS_DIALOG_STAGE_DIALOG_UNIMPLEMENTED = "StageDialogUnimplemented";

	public static String UMS_DIALOG_DELETE_SPRITE_DIALOG_YES = "DeleteSpriteDialogYes";
	public static String UMS_DIALOG_DELETE_SPRITE_DIALOG_NO = "DeleteSpriteDialogNo";

	//Optionsmenu

	public static String UMS_OPTIONS_MENU_SHOW_DETAILS = "OptionsMenuShowDetails";
	public static String UMS_OPTIONS_MENU_COPY = "OptionsMenuCopy";
	public static String UMS_OPTIONS_MENU_CUT = "OptionsMenuCut";
	public static String UMS_OPTIONS_MENU_INSERT_BELOW = "OptionsMenuInsertBelow";
	public static String UMS_OPTIONS_MENU_MOVE = "OptionsMenuMove";
	public static String UMS_OPTIONS_MENU_RENAME = "OptionsMenuRename";
	public static String UMS_OPTIONS_MENU_DELETE = "OptionsMenuDelete";
	public static String UMS_OPTIONS_MENU_UPLOAD = "OptionsMenuUpload";
	public static String UMS_OPTIONS_MENU_UNPACKING = "OptionsMenuUnpacking";
	public static String UMS_OPTIONS_MENU_BACKPACK = "OptionsMenuBackpack";
	public static String UMS_OPTIONS_MENU_TERMS_OF_USE = "OptionsMenuTermsOfUse";
	public static String UMS_OPTIONS_MENU_RATE_US = "OptionsMenuRateUs";
	public static String UMS_OPTIONS_MENU_ABOUT = "OptionsMenuAboutPocketCode";
	static String UMS_OPTINS_MENU_HOME = "OptionsMenuHome";
	public static String UMS_OPTIONS_MENU_SETTINGS = "OptionsMenuSettings";

	//Contextmenu
	//public static String UMS_CONTEXT_MENU_SHOW_DETAILS = "OptionsMenuShowDetails";
	public static String UMS_CONTEXT_MENU_COPY = "ContextMenuCopy";
	public static String UMS_CONTEXT_MENU_CUT = "ContextMenuCut";
	public static String UMS_CONTEXT_MENU_INSERT_BELOW = "ContextMenuInsertBelow";
	public static String UMS_CONTEXT_MENU_MOVE = "ContextMenuMove";
	public static String UMS_CONTEXT_MENU_RENAME = "ContextMenuRename";
	public static String UMS_CONTEXT_MENU_DELETE = "ContextMenuDelete";
	public static String UMS_CONTEXT_MENU_BACKPACK = "ContextMenuBackpack";
	//public static String UMS_CONTEXT_MENU_UPLOAD = "OptionsMenuUpload";

	public static String UMS_CONTEXT_MENU_SET_DESCRIPTION = "ContextMenuDescription";

	public static String UMS_CONTEXT_MENU_UPLOAD = "ContextMenuUpload";

	public static String UMS_SCRIPT_ACTIVITY_FRAGMENT_CATEGORY = "ScriptCategory";

	public static String UMS_DRAG_AND_DROP_ACTION_UP = "ListDragAndDropUp";
	public static String UMS_DRAG_AND_DROP_ACTION_DOWN = "ListDragAndDropDown";

}
