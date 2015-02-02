package com.example.wakiewakie;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Toast;

import com.app.alarmsocial.views.MyCard;
import com.app.alarmsocial.views.MyImageCard;
import com.app.alarmsocial.views.MyPlayCard;
import com.fima.cardsui.objects.CardStack;
import com.fima.cardsui.views.CardUI;

public class MainActivity extends Activity {

	private CardUI mCardView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mCardView = (CardUI) findViewById(R.id.cardsview);
		mCardView.setSwipeable(false);
		
		CardStack stack2 = new CardStack();
		stack2.setTitle("I like to poop cards");
		mCardView.addStack(stack2);
		mCardView.addCard(new MyCard("Poop-e"));
		mCardView.addCardToLastStack(new MyCard("Pee Pee"));
		MyCard androidViewsCard = new MyCard("Touch Me");
		androidViewsCard.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {		
				Toast.makeText(MainActivity.this, "You touched me", Toast.LENGTH_SHORT).show();
			}
		});
		
		mCardView.addCardToLastStack(androidViewsCard);
		
		mCardView
		.addCardToLastStack(new MyPlayCard(
				"Set Clickable or Not",
				"You can easily implement an onClickListener on any card, but the last boolean parameter of the PlayCards allow you to toggle the clickable background.",
				"#4ac925", "#222222", true, true));
		
		mCardView.addCardToLastStack(new MyPlayCard("Google Play",
				"This card mimics the new Google play cards look", "#33b6ea",
				"#33b6ea", true, false));

		mCardView
				.addCardToLastStack(new MyPlayCard(
						"Menu Overflow",
						"The PlayCards allow you to easily set a menu overflow on your card.\nYou can also declare the left stripe's color in a String, like \"#33B5E5\" for the holo blue color, same for the title color.",
						"#e00707", "#e00707", false, true));

		// add one card
		mCardView
				.addCard(new MyPlayCard(
						"Different Colors for Title & Stripe",
						"You can set any color for the title and any other color for the left stripe",
						"#f2a400", "#9d36d0", false, false));
		
		mCardView.addCard(new MyImageCard("Image", R.drawable.url1));
		
		CardStack stackPlay = new CardStack();
		stackPlay.setTitle("Bathroom");
		mCardView.addStack(stackPlay);
		mCardView.refresh();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
