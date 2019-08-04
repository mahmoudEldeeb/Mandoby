package com.g2m.mandoby.views.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.g2m.mandoby.MainActivity;
import com.g2m.mandoby.R;
import com.g2m.mandoby.databinding.ActivityCartBinding;
import com.g2m.mandoby.views.adapters.CartAdapter;
import com.g2m.mandoby.views.adapters.CompanyAdapter;
import com.g2m.mandoby.views.adapters.ProductsAdapter;
import com.g2m.mandoby.views.interf.CartClickLixtener;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class CartActivity extends AppCompatActivity implements CartClickLixtener {
ActivityCartBinding cartBinding;
CartAdapter cartAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       cartBinding = DataBindingUtil.setContentView(this,R.layout.activity_cart);
        cartBinding.resCarts.setLayoutManager(new LinearLayoutManager(this));

        cartBinding.resCarts.setLayoutManager(new LinearLayoutManager(this));
        cartAdapter=new CartAdapter(this);
        cartBinding.resCarts.setAdapter(cartAdapter);
        cartBinding.setClickListener(this);

    }
    int  mYear;
    int  mMonth;
    int  mDay;
    @Override
    public void pickerDate() {



        Log.v("qqqqq","ffffffffffff");
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("لتاكيد الطلب");
        builder.setMessage("لابد من اخيار تاريخ توصيل الطلب");
        final EditText input = new EditText(CartActivity.this);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);
        input.setLayoutParams(lp);
        builder.setView(input);

        builder.setPositiveButton("نعم", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface di, int i) {
                //di.dismiss();
                Log.v("ssss",input.getText().toString());
               // getDate();
            }
        });
        builder.setNegativeButton("الغاء", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.show();
    }
    public void getDate(){
        Calendar mcurrentDate = Calendar.getInstance();
        mYear = mcurrentDate.get(Calendar.YEAR);
        mMonth = mcurrentDate.get(Calendar.MONTH);
        mDay = mcurrentDate.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog mDatePicker = new DatePickerDialog(CartActivity.this, new DatePickerDialog.OnDateSetListener() {
            public void onDateSet(DatePicker datepicker, int selectedyear, int selectedmonth, int selectedday) {
                Calendar myCalendar = Calendar.getInstance();
                myCalendar.set(Calendar.YEAR, selectedyear);
                myCalendar.set(Calendar.MONTH, selectedmonth);
                myCalendar.set(Calendar.DAY_OF_MONTH, selectedday);
                String myFormat = "dd/MM/yyyy";
                SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.FRANCE);
                Log.v("qqqq",sdf.format(myCalendar.getTime()));
                mDay = selectedday;
                mMonth = selectedmonth;
                mYear = selectedyear;
            }
        }, mYear, mMonth, mDay);
        mDatePicker.setTitle("قم باختيار المعاد ");
        mDatePicker.show();
    }
    @Override
    public void goHome() {
this.onBackPressed();
    }
}
