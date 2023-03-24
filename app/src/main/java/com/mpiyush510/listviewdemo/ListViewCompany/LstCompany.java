package com.mpiyush510.listviewdemo.ListViewCompany;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.mpiyush510.listviewdemo.R;
import com.mpiyush510.listviewdemo.databinding.ActivityLstCompanyBinding;

public class LstCompany extends AppCompatActivity {
ActivityLstCompanyBinding binding;
int[] img={R.drawable.discord,R.drawable.facebook,R.drawable.github,R.drawable.instagram,R.drawable.pinterest,R.drawable.telegram,R.drawable.whatsapp};
String[] text={"Discord","Facebook","Github","Instagram","Pinterest","Telegram","Whatsapp"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityLstCompanyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mdAdapter mdf=new mdAdapter(getApplicationContext(),text,img);
        binding.lst1.setAdapter(mdf);
    }
}