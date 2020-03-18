package com.example.listview01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.listview01.adapters.StoreAdapter;
import com.example.listview01.databinding.ActivityMainBinding;
import com.example.listview01.datas.Store;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    List<Store> storeDatas = new ArrayList<>();
//    목록을 뿌려줄 SotrAdapter 변수
    ActivityMainBinding binding = null;
    StoreAdapter storeAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        setupEvents();
        setValues();
        addStores();

    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {
//        어댑터를 객체화 (우리가 작성한 생성자 활용)
        storeAdapter = new StoreAdapter(mContext, R.layout.store_list_item, storeDatas);
        binding.storeListView.setAdapter(storeAdapter);
    }

    void addStores() {
        storeDatas.add(new Store("삼겹더하기 본점",4));
        storeDatas.add(new Store("삼겹더하기 본점",3));

    }

}
