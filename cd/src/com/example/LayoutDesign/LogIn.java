package com.example.LayoutDesign;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.LayoutDesign.lauoutHandle.AppHandler;

/**
 * Created with IntelliJ IDEA.
 * User: nimantha
 * Date: 10/8/13
 * Time: 12:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class LogIn extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout .login);

        ListView lv = (ListView) findViewById(R.id.listview);

        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, AppHandler .getListView11());
        lv.setAdapter(arrayAdapter);
    }
}