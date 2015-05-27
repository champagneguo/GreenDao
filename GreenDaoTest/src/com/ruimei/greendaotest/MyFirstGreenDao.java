package com.ruimei.greendaotest;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class MyFirstGreenDao {

	public static void main(String[] args) {

		Schema schema = new Schema(6, "com.ntian.music.greendao");

		addNote(schema);
		try {
			new DaoGenerator().generateAll(schema, "..");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void addNote(Schema schema) {

		// Entity note = schema.addEntity("VideoScanRecords");
		// note.addIdProperty().autoincrement().primaryKey();
		// note.addLongProperty("Base_ID");
		// note.addBooleanProperty("Is_Scanned");
		// note.addLongProperty("PlayedPosition");
		// note.addDateProperty("Last_Played");
		// note.addStringProperty("Video_path");
		// note.addLongProperty("Time_Flag");
		// note.addStringProperty("Title");
		// note.addLongProperty("Duration");
		// note.addLongProperty("DateModified");
		// note.addBooleanProperty("IsDrm");
		// note.addBooleanProperty("Support3D");
		Entity musicmenu = schema.addEntity("MusicMenu");
		musicmenu.addIdProperty().autoincrement().primaryKey();
		musicmenu.addStringProperty("MenuName");
		musicmenu.addDateProperty("AddTime");
		musicmenu.addIntProperty("MusicItems");

		Entity musicmenudetail = schema.addEntity("MusicMenuDetail");

		musicmenudetail.addIdProperty().autoincrement().primaryKey();
		musicmenudetail.addStringProperty("Title");
		musicmenudetail.addStringProperty("TitlePinyin");
		musicmenudetail.addStringProperty("Singer");
		musicmenudetail.addStringProperty("MusicPath");
		musicmenudetail.addLongProperty("Base_ID");
		musicmenudetail.addStringProperty("MenuName");
		musicmenudetail.addDateProperty("MenuCreateTime");

	}
}
