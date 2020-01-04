package com.robinhood.ticker.sample;

import android.os.Bundle;

import com.robinhood.ticker.TickerUtils;
import com.robinhood.ticker.TickerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DemoActivity extends BaseActivity {
    private final String alphabetlist = "abcdefghijklmnopqrstuvwxyz";
    @BindView(R.id.tv_jin_e)
    TickerView tvJinE;
    private int count;
    private static final int MAX_TIMES = 100;
//    private TickerView ticker1, ticker2, ticker3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        ButterKnife.bind(this);

        tvJinE.setCharacterLists(TickerUtils.provideNumberList());
        tvJinE.setAnimationDuration(1500);
//        tvJinE.setPreferredScrollingDirection(TickerView.ScrollingDirection.UP);
//        tvJinE.setText("0");


//      icker1 = findViewById(R.id.ticker1);
//        ticker2 = findViewById(R.id.ticker2);
//        ticker3 = findViewById(R.id.ticker3);
//
//        ticker1.setPreferredScrollingDirection(TickerView.ScrollingDirection.DOWN);
//        ticker2.setPreferredScrollingDirection(TickerView.ScrollingDirection.UP);
//        ticker3.setPreferredScrollingDirection(TickerView.ScrollingDirection.ANY);
//
//        findViewById(R.id.perfBtn).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(DemoActivity.this, PerfActivity.class));
//            }
//        });
    }

    @Override
    protected void onUpdate() {
//        final int digits = RANDOM.nextInt(2) + 6;
//        ticker1.setText(getRandomNumber(digits));
//        final String currencyFloat = Float.toString(RANDOM.nextFloat() * 100);
//        ticker2.setText("$" + currencyFloat.substring(0, Math.min(digits, currencyFloat.length())));
//        ticker3.setText(generateChars(RANDOM, alphabetlist, digits));

//        生成5-26之间的随机数，包括26
//        int randNum = rand.nextInt(22)+5;
//        int randNum = rand.nextInt(2)+6;
//        int randNum = rand.nextInt(2)+2;

        count++;
        if (count <= MAX_TIMES) {
            final int digits = RANDOM.nextInt(2) + 6;
            tvJinE.setText(getRandomNumber(digits));
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
