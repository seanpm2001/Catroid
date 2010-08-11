package at.tugraz.ist.s2a.constructionSite.content;


import java.util.ArrayList;
import java.util.HashMap;

public class BrickDefine {
	
	//Definition of Brick
	public static final String BRICK_ID = "brick_id";
	public static final String BRICK_NAME = "brick_name";
	public static final String BRICK_VALUE = "brick_value";
	public static final String BRICK_VALUE_1 = "brick_value_1";
	public static final String BRICK_TYPE = "brick_type";
	// definition xyyy x = group y = brick id
	
	//group number 1 Control
	public final static int SET_BACKGROUND = 1001; 
	public final static int WAIT = 1002;
	
	//group number 2 Sound
	public final static int PLAY_SOUND = 2001;
	
	//group number 3 Motion
	public final static int GO_TO = 3001;
	
	//group number 4 Looks
	public final static int HIDE = 4001;
	public final static int SHOW = 4002;
	public final static int SET_COSTUME = 4003;
	
	//group number 9 Error
	public final static int NOT_DEFINED = 9999;
	
	public final static int STAGE_CATEGORY = 100001;
	public final static int OBJECT_CATEGORY = 100002;
	
	public static ArrayList<HashMap<String, String>> getToolBoxBrickContent(int id){
		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String,String>>();
		HashMap<String, String> map;
		
		switch(id){
		case STAGE_CATEGORY:
			map = new HashMap<String, String>();
	        map.put(BrickDefine.BRICK_ID, "1");
	        map.put(BrickDefine.BRICK_TYPE, String.valueOf(BrickDefine.SET_BACKGROUND));
	        map.put(BrickDefine.BRICK_NAME, "");
	        map.put(BrickDefine.BRICK_VALUE, "1");
	        list.add(map);
	        map = new HashMap<String, String>();
	        map.put(BrickDefine.BRICK_ID, "2");
	        map.put(BrickDefine.BRICK_TYPE, String.valueOf(BrickDefine.PLAY_SOUND));
	        map.put(BrickDefine.BRICK_NAME, "");
	        map.put(BrickDefine.BRICK_VALUE, "1");
	        list.add(map);
	        map = new HashMap<String, String>();
	        map.put(BrickDefine.BRICK_ID, "3");
	        map.put(BrickDefine.BRICK_TYPE, String.valueOf(BrickDefine.WAIT));
	        map.put(BrickDefine.BRICK_NAME, "");
	        map.put(BrickDefine.BRICK_VALUE, "1");
	        list.add(map);
	        
	        return list;
			
		case OBJECT_CATEGORY:
			map = new HashMap<String, String>();
		    map.put(BrickDefine.BRICK_ID, "12");
		    map.put(BrickDefine.BRICK_TYPE, String.valueOf(BrickDefine.PLAY_SOUND));
		    map.put(BrickDefine.BRICK_NAME, "");
		    map.put(BrickDefine.BRICK_VALUE, "1");
		    list.add(map);
		    map = new HashMap<String, String>();
		    map.put(BrickDefine.BRICK_ID, "13");
		    map.put(BrickDefine.BRICK_TYPE, String.valueOf(BrickDefine.WAIT));
		    map.put(BrickDefine.BRICK_NAME, "");
		    map.put(BrickDefine.BRICK_VALUE, "1");
		    list.add(map);
		    map = new HashMap<String, String>();
		    map.put(BrickDefine.BRICK_ID, "14");
		    map.put(BrickDefine.BRICK_TYPE, String.valueOf(BrickDefine.HIDE));
		    map.put(BrickDefine.BRICK_NAME, "");
		    map.put(BrickDefine.BRICK_VALUE, "");
		    list.add(map);
		    map = new HashMap<String, String>();
		    map.put(BrickDefine.BRICK_ID, "15");
		    map.put(BrickDefine.BRICK_TYPE, String.valueOf(BrickDefine.SHOW));
		    map.put(BrickDefine.BRICK_NAME, "");
		    map.put(BrickDefine.BRICK_VALUE, "");
		    list.add(map);
		    map = new HashMap<String, String>();
		    map.put(BrickDefine.BRICK_ID, "16");
		    map.put(BrickDefine.BRICK_TYPE, String.valueOf(BrickDefine.GO_TO));
		    map.put(BrickDefine.BRICK_NAME, "");
		    map.put(BrickDefine.BRICK_VALUE, "1");
		    map.put(BrickDefine.BRICK_VALUE, "1");
		    list.add(map);
		    map = new HashMap<String, String>();
		    map.put(BrickDefine.BRICK_ID, "17");
		    map.put(BrickDefine.BRICK_TYPE, String.valueOf(BrickDefine.SET_COSTUME));
		    map.put(BrickDefine.BRICK_NAME, "");
		    map.put(BrickDefine.BRICK_VALUE, "1");
		    list.add(map);
			
		default:
			return list;
		}
	}
	
}
