package com.app.alarmsocial.views;

import android.view.View;
import android.widget.TextView;

import com.example.wakiewakie.R;
import com.fima.cardsui.objects.RecyclableCard;

public class MyCard extends RecyclableCard {

	public MyCard(String title){
		super(title);
	}

	@Override
	protected int getCardLayoutId() {
		return R.layout.card_ex;
	}

	@Override
	protected void applyTo(View convertView) {
		((TextView) convertView.findViewById(R.id.title)).setText(title);
	}
}
