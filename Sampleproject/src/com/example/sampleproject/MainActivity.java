package com.example.sampleproject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends Activity implements OnClickListener {

	
	//private ArrayList <Employee> pArrayList;

	
ListView list;
Button b1,b2;
EditText ed1,ed2;
public static String na;
String name,n;

 public ArrayList<Employee> e = new ArrayList<Employee>();
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
list=(ListView) findViewById(R.id.listView1);
		
		ed1=(EditText)findViewById(R.id.editText1);
		ed2=(EditText) findViewById(R.id.editText2);
		
//		ArrayList <String> e1=new ArrayList<String>();
//		e1.add("madhu");
//		e1.add("vignesh");
//		e1.add("meena");
//		e1.add("aziz");
//		//
//		//ArrayList <Double> e2=new ArrayList<Double>();
//		//e2.add((double)20000);
//		//e2.add((double)22000);
//		//e2.add((double)16000);
//		//e2.add((double)21000);
//		//System.out.println("ArrayList contains:" +P2);*/
//		ArrayList<String> e3=new ArrayList<String>();
//		e3.add("Developer");
//		e3.add("Testing");
//		e3.add("Program Analyst");
//		e3.add("System Analyst");
//
//		//System.out.println("ArrayList contains:" +p3);
//		int i;
//		//////String pro[]=new String[]{"ironbox","hairdryer","table","micro oven"};
//		for(i=0;i<e1.size();i++){
//			Employee emp=new Employee();
//			emp.setname(e1.get(i));
//			//emp.setsalary(e2.get(i));
//			emp.setdesignation(e3.get(i));
//			
//		 e.add(emp);
//		}
		

		//ArrayList<String> pName = new ArrayList<String>();
		//// System.out.println(pro);
		//for(int j=0;j<e.size();j++)
		//{
//			Employee emplo = new Employee();
//			emplo = e.get(j);
//			pName.add(emplo.getname());
		//}


		
		// 
		// list.setOnItemClickListener(new OnItemClickListener(){
//			 
		//
//			@Override
//			public void onItemClick(AdapterView<?> parent, View view,
//					int position, long id) {
//				// TODO Auto-generated method stub
//				 int itemPosition=position;
//				 String itemValue=(String)list.getItemAtPosition(position);
		//
//			}
//			 
		// });
		
		
		
		b1=(Button) findViewById(R.id.button1);
		b1.setOnClickListener(this); 
		}
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				name=ed1.getText().toString();
				n=ed2.getText().toString();
				
					Employee emp=new Employee();
					emp.setname(name);
					emp.setdesignation(n);
					
				e.add(emp);
				getvalue();
							}
		
			
public void getvalue()
{
	 ArrayList <String> en =new ArrayList <String>();
	 ArrayList <String> ed =new ArrayList <String>();
		
	 //String name,n;
	
	Employee emp1=new Employee();
	for(int i=0;i<e.size();i++)
	{
		emp1=e.get(i);
		
		en.add(emp1.getname());
		ed.add(emp1.getdesignation());
		
	
	}
	ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,en);
	 list.setAdapter(adapter);

	 System.out.println(""+en);
	 //System.out.println(""+ed);
b2=(Button) findViewById(R.id.button2);
b2.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		
		Intent mIntent = new Intent(MainActivity.this, SubActivity.class);
		Bundle b = new Bundle();
		b.putString("name",name);
		mIntent.putExtras(b);
		startActivity(mIntent);
		 
	}
});
}

@Override
protected void onStart() {
	// TODO Auto-generated method stub
	super.onStart();
	{
		
		
		for(int i=0;i<e.size();i++)
		{
			Employee emp=new Employee();
			if(emp.getname()==name){
				emp.getdesignation();
				Toast toast=Toast.makeText(this,"message", Toast.LENGTH_LONG);
				toast.show();
			
			}

		
		}
}




}}

				