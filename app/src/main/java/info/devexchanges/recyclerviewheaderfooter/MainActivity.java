package info.devexchanges.recyclerviewheaderfooter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> recyclerItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);

        //set layout manager for the recycler view
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        setData();
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, recyclerItemList);
        recyclerView.setAdapter(adapter);
    }

    public void setData() {
        recyclerItemList = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            recyclerItemList.add(String.valueOf(i));
        }
    }
}
