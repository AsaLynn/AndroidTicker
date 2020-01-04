package com.robinhood.ticker.sample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class EnterActivity extends BaseActivity {
    private final String alphabetlist = "abcdefghijklmnopqrstuvwxyz";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);
        ButterKnife.bind(this);


//        findViewById(R.id.perfBtn).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(EnterActivity.this, PerfActivity.class));
//            }
//        });
    }

    @Override
    protected void onUpdate() {
//        final int digits = RANDOM.nextInt(2) + 6;
//
//        ticker1.setText(getRandomNumber(digits));
//        final String currencyFloat = Float.toString(RANDOM.nextFloat() * 100);
//        ticker2.setText("$" + currencyFloat.substring(0, Math.min(digits, currencyFloat.length())));
//        ticker3.setText(generateChars(RANDOM, alphabetlist, digits));
    }

    @OnClick({R.id.btn_demo1, R.id.btn_demo2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_demo1:
                startActivity(new Intent(EnterActivity.this, MainActivity.class));
                break;
            case R.id.btn_demo2:
                startActivity(new Intent(EnterActivity.this, DemoActivity.class));
                break;
        }
    }

//    private String generateChars(Random random, String list, int numDigits) {
//        final char[] result = new char[numDigits];
//        for (int i = 0; i < numDigits; i++) {
//            result[i] = list.charAt(random.nextInt(list.length()));
//        }
//        return new String(result);
//    }
}
