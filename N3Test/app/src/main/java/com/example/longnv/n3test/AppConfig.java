package com.example.longnv.n3test;

import java.text.Collator;
import java.util.Locale;

/**
 * Created by SonNM6 on 2/27/2017.
 */

public class AppConfig {
    private AppConfig() {
        //
    }

    public static final int BAND_AM = 1;

    public static final int BAND_FM = 2;

    public static final int CHANNEL_NUMBER_DEFAULD = -1;

    public static int sFxStart(int band) {
        if (band == BAND_AM) {
            return FX_START_AM;
        } else {
            return FX_START_FM;
        }
    }

    ;

    public static int sUnit(int band) {
        if (AppConfig.BAND_AM == band) {
            return 9;
        } else {
            return 100;
        }
    }

    public static int sFxEnd(int band) {
        if (band == BAND_AM) {
            return FX_END_AM;
        } else {
            return FX_END_FM;
        }
    }

    ;
    public static final int FX_END_FM = 108000;
    public static final int FX_START_FM = 87500;

    public static final int FX_START_AM = 531;

    public static final int FX_END_AM = 1629;


    // Radio Option Menu
    public static final String KEY_STATION = "Stations";
    public static final String KEY_PRESET = "Preset";
    public static final String KEY_PTY = "PTY";


    public static final int SUB_CHANNEL_DEFAULT = 0;
    // Database Constant
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "database";
    public static final String TABLE_FAVORITE_SONG = "favorite";
    public static final String KEY_ID = "_id";
    public static final String KEY_SONG_PATH = "path";
    public static final String BLUE_COLOR = "#2cfee5";
    //Media Service
    public static final String MSG_MEDIA_COMPLETED = "media_completed";
    public static final String MSG_SONG_NAME = "song_name";
    public static final String MSG_SONG_PATH = "song_path";
    public static final String MSG_ARTIST_NAME = "artist";
    public static final String ACTION_MSG_TRACK_INFO_NEXT = "next_action";
    public static final String ACTION_MSG_TRACK_INFO_PRE = "pre_action";
    public static final String ACTION_MSG_TRACK_INFO_CONTROL = "control_action";
    public static final String ACTION_MSG_CHANGE_CONTROL_BG = "control_bg";
    public static final String ACTION_MSG_CHANGE_SHUFFLER_BG = "shuffler_bg";
    public static final String ACTION_MSG_CHANGE_REPEAT_BG = "repeat_bg";
    public static final int READ_EXTERNAL_STORAGE = 94;
    public static final int BIND_SERVICES_FROM_MEDIA_CONTROL = 0;
    public static final int BIND_SERVICES_FROM_MEDIA_NEXT = 1;
    public static final int BIND_SERVICES_FROM_MEDIA_PREVIOUS = 2;
    public static final int BIND_SERVICES_FROM_QUEUE_LIST = 3;
    public static final String ACTION_MSG_TRACK_INFO = "send_track_info";
    public static final String KEY_MSG_TRACK_ID = "track_id";
    public static final String KEY_MSG_TRACK_NAME = "track_name";
    public static final String KEY_MSG_TRACK_ARTIST = "track_artist";
    public static final String KEY_MSG_TRACK_TOTAL_TIME = "track_total_time";
    public static final String KEY_MSG_IS_PLAYING = "track_is_playing";
    public static final String KEY_MSG_IS_SHUFFLER = "track_is_shuffler";
    public static final String KEY_MSG_REPEAT_MODE = "track_repeat_mode";
    public static final String KEY_MSG_TRACK_PATH = "track_path";
    public static final int MSG_TRACK_CONTROL_PLAY = 1;
    public static final int MSG_TRACK_CONTROL_NEXT = 2;
    public static final int MSG_TRACK_CONTROL_PRE = 3;
    public static final int MSG_TRACK_CONTROL_SHUFFLER = 4;
    public static final int MSG_TRACK_CONTROL_REPEAT = 5;
    public static final int MSG_TRACK_CONTROL_DO_FOWARD = 6;
    public static final int MSG_TRACK_CONTROL_REWIND = 7;
    public static final String KEY_MSG_TRACK_CONTROL_MODE = "track_path_mode";
    public static final String ACTION_MSG_TRACK_INFO_RUNTIME = "send_track_info_runtime";
    public static final String ACTION_MSG_TRACK_INFO_RUNTIME_FROM_WIDGET = "send_track_info_runtime_from_widget";
    public static final String ACTION_MSG_TRACK_INFO_CHANGE_WIDGET_FIRST = "send_track_info_change_widget_first";
    public static final String KEY_MSG_TRACK_CURRENT_TIME = "track_current_time";
    public static final String KEY_MSG_TRACK_MAX_TIME = "track_max_time";
    public static final String ACTION_MSG_TRACK_CHECK_DATA_MEDIA = "check_data_from_media";
    public static final Integer REPEAT_MODE_OFF = 0;
    public static final Integer REPEAT_MODE_ONE = 1;
    public static final Integer REPEAT_MODE_ALL = 2;
    //HungNN19
    public static final String KEY_ALBUM_NAME = "album_name";
    public static final String KEY_GENRES_NAME = "genres_name";
    public static final String KEY_ARTIST_NAME = "artist_name";
    public static final String KEY_PLAYLIST_NAME = "playlist_name";
    public static final String NULL_DATA = "<Unknown>";
    public static final Collator COL = Collator.getInstance(Locale.KOREA);
    public static final String IS_SHUFFER = "IS_SHUFFER";
    public static final String IS_REPEAT = "IS_REPEAT";
    public static final String SHUFFER_STATE = "SHUFFER_STATE";
    public static final String CHANGE_SHUFFER = "CHANGE_SHUFFER";
    public static final String RECYCLEVIEW_ITEM_NO_HEADER = "No";
    public static final String ITEM_NOT_ALPHABET = "#";
    public static final String TEXT_SONG = " Songs";
    public static final int INT_ZERO = 0;
    public static final int INT_ONE = 1;
    public static final int INT_TWO = 2;
    public static final int INT_THREE = 3;
    public static final int INT_FOUR = 4;
    public static final int INT_FIVE = 5;
    public static final int INT_TEN = 10;
    public static final int UPDATE_TEXT_SCROLL = 20;
    public static final Integer DELAY_TIME_FOR_FAST_FORWARD_EVENT = 200;
    public static final long TIME_DELAY_UPDATE_TRACKINFO = 900;
    public static final long TIME_DELAY_UPDATE_SEEKBAR_TIME = 90;
    public static final long TIME_DO_REWIND_VIDEO = 10000;
    public static final long DELAY_UPDATE_SEEKBAR_TIME = 50;
    public static final int POPUP_WINDOW_WIDTH = 741;
    public static final int POPUP_WINDOW_HEIGHT = 434;
    public static final int LOCATION_X = 780;
    public static final int LOCATION_Y = 325;
    public static final String[] sListAudioFormat = {".mp3", ".MP3", ".flac", ".FLAC", ".wav", ".WAV", ".aac", ".AAC", ".3gp", ".3GP"};
    public static final String FORMAT = "%d:%02d";
    public static final String CHARACTER_D_LOWER = "D";
    public static final String SPACE_TEXT = " ";
    public static final String ACTION_USB_PERMISSION = "com.androidinspain.otgviewer.USB_PERMISSION";
    public static final String NULL_UPPER = "Null";
    public static final String NULL_LOWER = "null";
    public static final String REPEAT_TEXT = "1";

    //Key Board
    public static final String CHARACTER_A = "A";
    public static final String CHARACTER_B = "B";
    public static final String CHARACTER_C = "C";
    public static final String CHARACTER_D = "D";
    public static final String CHARACTER_E = "E";
    public static final String CHARACTER_F = "F";
    public static final String CHARACTER_G = "G";
    public static final String CHARACTER_H = "H";
    public static final String CHARACTER_I = "I";
    public static final String CHARACTER_J = "J";
    public static final String CHARACTER_K = "K";
    public static final String CHARACTER_L = "L";
    public static final String CHARACTER_M = "M";
    public static final String CHARACTER_N = "N";
    public static final String CHARACTER_O = "O";
    public static final String CHARACTER_P = "P";
    public static final String CHARACTER_Q = "Q";
    public static final String CHARACTER_R = "R";
    public static final String CHARACTER_S = "S";
    public static final String CHARACTER_T = "T";
    public static final String CHARACTER_U = "U";
    public static final String CHARACTER_V = "V";
    public static final String CHARACTER_W = "W";
    public static final String CHARACTER_X = "X";
    public static final String CHARACTER_Y = "Y";
    public static final String CHARACTER_Z = "Z";
    public static final String CHARACTER_OTHER = "#";
    public static final String EMPTY_TEXT = "";
    public static final String PLAYLIST_SCREEN = "PlayList";
    public static final String ALBUM_SCREEN = "Album";
    public static final String ARTIST_SCREEN = "Artists";
    public static final String SONGS_SCREEN = "Songs";
    public static final String GENRES_SCREEN = "Genres";
    public static final String IS_FIRTS = "IS_FIRTS";
    public static final String CURRENT_APP_MEDIA = "CURRENT_APP_MEDIA";
    public static final String TAG_BASE_FRAGMENT = "PopupListBaseFragment";
    public static final String TAG_KEY_BOARD_FRAGMENT = "KeyBoardFragment";
    public static final String TITLE_FAVOURITES = "Favourites";
    public static final String ALL_SONG = "All Songs";
    public static final String KEY_ALPHABET = "KEY_ALPHABET";
    public static final String KEY_CONFRIM = "Attaching USB, please wait...";
//Local change source

    public static final String USB_MUSIC = "USB Music";
    public static final String AUX = "AUX";
    public static final String BLUETOOTH_AUDIO = "Bluetooth Audio";
    public static final String FM = "FM";
    public static final String AM = "AM";
    public static final String LOCAL_MEDIA_PLAYER = "Local Media Player";
    public static final String THE_SERVICE_IS_UNAVAILABLE = "The Service Is Unavailable";

    public static final int VIEW_TYPE_HEADER = 0x00;
    public static final int VIEW_TYPE_CONTENT = 0x01;
    public static final int TIME_DELAY_FOR_ATTACH_USB = 15000;
    public static final int TIME_DELAY_FOR_MENU_CLINK = 500;
    public static final String TAG_PLAYLIST_EDIT_MODE = "playlist_edit_mode";
    public static final String ACTION_DONE_UPDATE_FARVOURITE = "update_farvourite";
    public static final String KEY_DONE_UPDATE_ALL_FARVOURITE = "delete_all_farvourite";

    public static final int SIZE_LIST_PRESET = 12;

}
