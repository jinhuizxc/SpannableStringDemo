package com.jh.spannablestringdemo;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;

/**
 * Created by MarioStudio on 2016/6/5.
 */

public class ShowActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        TextView textView = (TextView) findViewById(R.id.text01);

        SpannableString spannableString = new SpannableString("万丈高楼平地起");

        RelativeSizeSpan sizeSpan01 = new RelativeSizeSpan(1.2f);
        RelativeSizeSpan sizeSpan02 = new RelativeSizeSpan(1.4f);
        RelativeSizeSpan sizeSpan03 = new RelativeSizeSpan(1.6f);
        RelativeSizeSpan sizeSpan04 = new RelativeSizeSpan(1.8f);
        RelativeSizeSpan sizeSpan05 = new RelativeSizeSpan(1.6f);
        RelativeSizeSpan sizeSpan06 = new RelativeSizeSpan(1.4f);
        RelativeSizeSpan sizeSpan07 = new RelativeSizeSpan(1.2f);

        spannableString.setSpan(sizeSpan01, 0, 1, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(sizeSpan02, 1, 2, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(sizeSpan03, 2, 3, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(sizeSpan04, 3, 4, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(sizeSpan05, 4, 5, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(sizeSpan06, 5, 6, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(sizeSpan07, 6, 7, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);



        SpannableString spannableString01 = new SpannableString("设置文字的前景色为淡蓝色");
        ForegroundColorSpan colorSpan01 = new ForegroundColorSpan(Color.parseColor("#0099EE"));
        spannableString01.setSpan(colorSpan01, 9, spannableString01.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);



        SpannableString spannableString02 = new SpannableString("设置文字的背景色为淡绿色");
        BackgroundColorSpan colorSpan02 = new BackgroundColorSpan(Color.parseColor("#AC00FF30"));
        spannableString02.setSpan(colorSpan02, 9, spannableString02.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);



        SpannableString spannableString03 = new SpannableString("为文字设置下划线");
        UnderlineSpan underlineSpan03 = new UnderlineSpan();
        spannableString03.setSpan(underlineSpan03, 5, spannableString03.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);



        SpannableString spannableString04 = new SpannableString("为文字设置删除线");
        StrikethroughSpan strikethroughSpan04 = new StrikethroughSpan();
        spannableString04.setSpan(strikethroughSpan04, 5, spannableString04.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);



        SpannableString spannableString05 = new SpannableString("为文字设置上标");
        SuperscriptSpan superscriptSpan05 = new SuperscriptSpan();
        spannableString05.setSpan(superscriptSpan05, 5, spannableString05.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);



        SpannableString spannableString06 = new SpannableString("为文字设置下标");
        SubscriptSpan subscriptSpan06 = new SubscriptSpan();
        spannableString06.setSpan(subscriptSpan06, 5, spannableString06.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);



        SpannableString spannableString07 = new SpannableString("为文字设置超链接");
        URLSpan urlSpan = new URLSpan("http://www.jianshu.com/users/dbae9ac95c78");
        spannableString07.setSpan(urlSpan, 5, spannableString07.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(Color.parseColor("#36969696"));



        SpannableString spannableString08 = new SpannableString("为文字设置点击事件");
        MyClickableSpan clickableSpan = new MyClickableSpan("http://www.jianshu.com/users/dbae9ac95c78");
        spannableString08.setSpan(clickableSpan, 5, spannableString08.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(Color.parseColor("#36969696"));



        SpannableString spannableString09 = new SpannableString("为文字设置粗体、斜体风格");
        StyleSpan styleSpan_B  = new StyleSpan(Typeface.BOLD);
        StyleSpan styleSpan_I  = new StyleSpan(Typeface.ITALIC);
        spannableString09.setSpan(styleSpan_B, 5, 7, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString09.setSpan(styleSpan_I, 8, 10, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(Color.parseColor("#36969696"));



        SpannableString spannableString10 = new SpannableString("在文本中添加表情（表情）");
        Drawable drawable = getResources().getDrawable(R.mipmap.aa);
        drawable.setBounds(0, 0, 42, 42);
        ImageSpan imageSpan = new ImageSpan(drawable);
        spannableString10.setSpan(imageSpan, 6, 8, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(Color.parseColor("#36969696"));



        SpannableString spannableString11 = new SpannableString("为文字设置图片（图片）");
        Drawable drawable1 = getResources().getDrawable(R.mipmap.ic_launcher);
        drawable1.setBounds(0, 0, 36, 36);
        ImageSpan imageSpan1 = new ImageSpan(drawable);
        spannableString11.setSpan(1, 5, 7, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(Color.parseColor("#36969696"));

        textView.setText(spannableString);
    }

    class MyClickableSpan extends ClickableSpan {

        private String content;

        public MyClickableSpan(String content) {
            this.content = content;
        }

        @Override
        public void updateDrawState(TextPaint ds) {
            ds.setUnderlineText(false);
        }

        @Override
        public void onClick(View widget) {
            Intent intent = new Intent(ShowActivity.this, OtherActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("content", content);
            intent.putExtra("bundle", bundle);
            startActivity(intent);
        }
    }
}
