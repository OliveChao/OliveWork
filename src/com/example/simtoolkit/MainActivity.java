package com.example.simtoolkit;

import java.util.ArrayList;
import java.util.Arrays;
import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ActionBarActivity implements OnItemClickListener {
	
	//declaration of variables
	private ListView listView1;
	private ArrayAdapter<String> stringArrayAdapter;
	String []items = {"Safaricom +","M-PESA","Contacts Backup"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_page);
		
		//initialization of variables
		//findViewById
		listView1 = (ListView)findViewById(R.id.listView1);
		
		//Add array of items to the list view using an arrayAdapter
		ArrayList<String> itemList = new ArrayList<String>();
		itemList.addAll(Arrays.asList(items));
		
		//Designing the list view
		stringArrayAdapter = new ArrayAdapter<String>(this, R.layout.list_style,itemList);
		
		//Setting an OnItemClickListener
		listView1.setAdapter (stringArrayAdapter);
		listView1.setOnItemClickListener(this);
		
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		// switch case
		switch (position) {
		case 0:
			startActivity(new Intent(getApplicationContext(),Safaricom.class));
			break;
			
		case 1:
			startActivity(new Intent(getApplicationContext(),MPesa.class));
			break;
			
		case 2:
			startActivity(new Intent(getApplicationContext(),ContactsBackup.class));

		default:
			break;
		}
		
	}

	
}
