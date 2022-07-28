package com.gymkhana;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gymkhana.R;

import java.util.ArrayList;

import Adaptor.CategoryAdaptor;
import Adaptor.PopularAdapter;
import Domain.CategoryDomain;
import Domain.foodDomain;

public class MainActivity extends AppCompatActivity {

//    TextView firstnametv, lastnametv;

    private RecyclerView.Adapter adapter,adapter2;
    public RecyclerView recyclerViewCategoryList,recyclerViewPopularList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewCategory();
        recyclerViewPopular();
    }

    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        recyclerViewCategoryList=findViewById(R.id.recyclerView);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> category=new ArrayList<>();
        category.add(new CategoryDomain("Pizza","cat_1"));
        category.add(new CategoryDomain("Burger", "cat_2"));
        category.add(new CategoryDomain("HotDog","cat_3"));
        category.add(new CategoryDomain("Drink", "cat_4"));
        category.add(new CategoryDomain("Donut", "cat_5"));

        adapter = new CategoryAdaptor(category);
        recyclerViewCategoryList.setAdapter(adapter);

    }
    private void recyclerViewPopular(){
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewCategoryList=findViewById(R.id.recyclerView2);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<foodDomain> foodList=new ArrayList<>();
        foodList.add(new foodDomain("Pepperoni pizza", "Pepperoni pizza", "pop_1",250));
        foodList.add(new foodDomain("cheese Burger","bug1","pop_2",170));
        foodList.add(new foodDomain("Veg pizza","piz2","pop_3",190));

        adapter2=new PopularAdapter(foodList);
        recyclerViewCategoryList.setAdapter(adapter2);

    }


//        FirebaseAuth auth = FirebaseAuth.getInstance();
//        FirebaseUser currentUser = auth.getCurrentUser();
//                if(currentUser == null){
//                    Intent intent = new Intent(this, loginactivity.class);
//                    startActivity(intent);
//                    finish();
//                    return;
//
//                }
//
//                firstnametv = findViewById(R.id.firstnametv);
//                lastnametv = findViewById(R.id.lastnametv);
//
//        Button logout = findViewById(R.id.logout);
//        logout.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                logoutUser();
//            }
//        });
//
//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference reference = database.getReference("users").child(currentUser.getUid());
//        reference.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot snapshot) {
//                User user = snapshot.getValue(User.class);
//                if(user != null)
//                firstnametv.setText(user.firstname);
//                lastnametv.setText(user.lastname);
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//
//            }
//        });
//
//
//    }
//
//    private void logoutUser() {
//        FirebaseAuth.getInstance().signOut();
//        Intent intent = new Intent(MainActivity.this, loginactivity.class);
//        startActivity(intent);
//        finish();
    }
