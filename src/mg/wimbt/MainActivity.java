package mg.wimbt;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends Activity {
	
	private AdView adView;
	private InterstitialAd interstitial;
	private static final String AD_UNIT_ID_1 = "ca-app-pub-2738757694043962/6478609735";
	private static final String AD_UNIT_ID_2 = "ca-app-pub-2738757694043962/1490006931";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Create an ad.
	    adView = new AdView(this);
	    adView.setAdSize(AdSize.BANNER);
	    adView.setAdUnitId(AD_UNIT_ID_1);
		
	    
	 // Add the AdView to the view hierarchy. The view will have no size
	    // until the ad is loaded.
	    RelativeLayout layout = (RelativeLayout) findViewById(R.id.rl);
	    RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
	            LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
	    params.addRule(RelativeLayout.BELOW, findViewById(R.id.textView1).getId());
	    params.addRule(RelativeLayout.CENTER_HORIZONTAL);
	    
	    layout.addView(adView,params);
	    
	    
	 // Create an ad request. Check logcat output for the hashed device ID to
	    // get test ads on a physical device.
	    AdRequest adRequest = new AdRequest.Builder().build();;
	    
	 // Start loading the ad in the background.
	    adView.loadAd(adRequest);
	    
	    
	    
	    // Create the interstitial.
	    interstitial = new InterstitialAd(this);
	    interstitial.setAdUnitId(AD_UNIT_ID_2);


	    	interstitial.setAdListener(new AdListener() {
	        @Override
	        public void onAdLoaded() {
	          
	        	displayInterstitial();

	          
	        }
	        @Override
	        public void onAdFailedToLoad(int errorCode) {
	          
	        }
	    });
		
	    // Create ad request.
	    AdRequest adRequest1 = new AdRequest.Builder().build();
	    // Begin loading your interstitial.
	    interstitial.loadAd(adRequest1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void knowBfsThought(View view) {
		
		
		String thoughts[]={"He is nervous.",
							"He is thinking how hot I am.",
							"He is thinking how smart I am.",
							"He is thinking how funny I am.",
							"He is thinking how sexy I am.",
							"He is thinking how lovely I am.",
							"He is thinking how charming I am.",
							"He is thinking how adorable I am.",
							"He is thinking how lovable I am.",
							"He is thinking that I am thinking about him.",
							"He is thinking that I will marry him.",
							"He is thinking about our first date.",
							"He is thinking about our relationship.",
							"He is fancying me.",
							"He is thinking to invite me to his place.",
							"He is feeling lucky to have me.",
							"He is thinking to take me on a dinner date.",
							"He is thinking how kind I am.",
							"He is thinking about my nice figure.",
							"He is thinking about my body.",
							"He thinking about my sexy eyes.",
							"He is thinking about my beautiful lips.",
							"He is thinking about our first kiss.",
							"He is missing me.",
							"He wants to come to my place.",
							"He wants to chat with me.",
							"He wants make love to me.",
							"He is thinking about throwing a pool party.",
							"He is thinking about his career.",
							"He is feeling bored.",
							"He wants to spend some time with me.",
							"He wants to drink beer with me.",
							"He wants to take me on an ice cream date.",
							"He wants to take me to a sea beach.",
							"He wants to smoke a cigarette with me.",
							"He wants to drink whisky with me.",
							"He is thinking about Miley Cyrus.",
							"He is comparing me with Miley Cyrus.",
							"He is comparing me with Angelina Jolie.",
							"He is comparing me with Megan Fox.",
							"He is comparing me with Ashley Benson.",
							"He is thinking that I am sexier than Miley Cyrus.",
							"He is thinking that I am sexier than Angelina Jolie.",
							"He is thinking that I am sexier than Megan Fox.",
							"He is thinking that I am sexier than Ashley Benson.",
							"He is thinking that I always think about my ex.",
							"He is thinking about his ex.",
							"He wants to take me on a shopping.",
							"He wants to dance with me.",
							"He wants to take me to a night club.",
							"He wants to take me to a casino.",
							"He wants to gift me a car.",
							"He wants to play video game with me.",
							"He is thinking about the day when he first saw me.",
							"He is thinking about buying roses for me.",
							"He wants to have a video chat with me.",
							"He wants to take me on a DJ event.",
							"He is trying to figure out my favourite color.",
							"He is admiring me for my honesty.",
							"He is thinking that I am very strong.",
							"He is thinking that I am very weak.",
							"He is thinking that I am serious about our relationship.",
							"He is thinking that I am not serious about our relationship.",
							"He is thinking that I am very good at computers.",
							"He is thinking that I am not very good at computers.",
							"He is thinking that I cook awesome.",
							"He is thinking about my dad.",
							"He is thinking about buying a private jet to go on a vacation with me.",
							"He is thinking about my mom.",
							"He is thinking about buying a Mercedes Benz to go on a vacation with me.",
							"He is thinking about buying a Lamborghini to go on a vacation with me.",
							"He wants to take me to moon.",
							"He is trying to figure out my favourite TV show.",
							"He is trying to figure out my favourite wine.",
							"He wants to take me to Antarctica.",
							"He wants to gift me a penguin.",
							"He wants to gift me a macaw.",
							"He wants to gift me a diamond necklace.",
							"He wants to watch Pokemon with me.",
							"He wants to watch Doraemon with me.",
							"He wants to watch Dragon Ball Z with me.",
							"He is thinking that he is smarter than me.",
							"He is thinking that I can be fooled easily.",
							"He is thinking that I am like Sherlock Holmes.",
							"He is thinking that I like Tom Cruise more than him.",
							"He is thinking that I like Brad Pit more than him.",
							"He is thinking that I like Robert Pattinson more than him.",
							"He is thinking that I like Justin Bieber more than him.",
							"He is thinking that I like Doraemon more than him.",
							"He wants to take me on a bike ride.",
							"He wants to marry me.",
							"He is thinking about honeymoon locations.",
							"He is thinking about baby names.",
							"He is thinking that I am in love with Jason Statham.",
							"He wants to play chess with me.",
							"He wants to protect me from evil forces.",
							"He wants to watch a horror movie with me.",
							"He wants to watch a action movie with me.",
							"He wants to watch a comedy movie with me.",
							"He wants to eat a pizza with me.",
							"He is thinking that I am sweeter than honey.",
							"He wants to take me on a pool date."
							
							
							
							
		};
		
		Random randomNumber=new Random();
		int n=(randomNumber.nextInt(thoughts.length));
		TextView textView = (TextView) findViewById(R.id.textView1);
		textView.setText(thoughts[n]+"\n\n");
		
	}
	
	@Override
	  public void onResume() {
	    super.onResume();
	    if (adView != null) {
	      adView.resume();
	    }
	  }

	  @Override
	  public void onPause() {
	    if (adView != null) {
	      adView.pause();
	    }
	    super.onPause();
	  }

	  /** Called before the activity is destroyed. */
	  @Override
	  public void onDestroy() {
	    // Destroy the AdView.
	    if (adView != null) {
	      adView.destroy();
	    }
	    super.onDestroy();
	  }
	  
	// Invoke displayInterstitial() when you are ready to display an interstitial.
		  public void displayInterstitial() {
		    if (interstitial.isLoaded()) {
		      interstitial.show();
		    }
		  }

}
