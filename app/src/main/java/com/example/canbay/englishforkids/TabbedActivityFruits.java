package com.example.canbay.englishforkids;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class TabbedActivityFruits extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    static MediaPlayer mpapple;
    static MediaPlayer mpbanana;
    static MediaPlayer mpcherry;
    static MediaPlayer mpcoconut;
    static MediaPlayer mpgrape;
    static MediaPlayer mpmelon;
    static TextView meyveturkce;
    static TextView meyveingilizce;
    static ImageView meyvefotografi;
    static ImageButton playbutton;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabbed_fruits);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        mpapple = MediaPlayer.create(this,R.raw.apple);
        mpbanana= MediaPlayer.create(this,R.raw.banana);
        mpcherry= MediaPlayer.create(this,R.raw.cherry);
        mpcoconut= MediaPlayer.create(this,R.raw.coconut);
        mpgrape= MediaPlayer.create(this,R.raw.grape);
        mpmelon= MediaPlayer.create(this,R.raw.melon);


      /*  FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tabbed_activity_fruits, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(this,QuizMainActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            if(getArguments().getInt(ARG_SECTION_NUMBER) ==1) {
                View rootView = inflater.inflate(R.layout.fragment_fruits, container, false);
                meyveturkce = (TextView) rootView.findViewById(R.id.meyveturkce);
                meyveingilizce= (TextView) rootView.findViewById(R.id.meyveingilizce);
                meyvefotografi = (ImageView) rootView.findViewById(R.id.meyvefotografi);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpapple.start();
                    }
                });
                return rootView;
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER) ==2) {
                View rootView = inflater.inflate(R.layout.fragment_fruits, container, false);
                meyveturkce = (TextView) rootView.findViewById(R.id.meyveturkce);
                meyveingilizce= (TextView) rootView.findViewById(R.id.meyveingilizce);
                meyvefotografi = (ImageView) rootView.findViewById(R.id.meyvefotografi);
                meyveturkce.setText("Muz");
                meyveingilizce.setText("Banana");
                meyvefotografi.setImageResource(R.drawable.banana);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpbanana.start();
                    }
                });
                return rootView;
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER) ==3) {
                View rootView = inflater.inflate(R.layout.fragment_fruits, container, false);
                meyveturkce = (TextView) rootView.findViewById(R.id.meyveturkce);
                meyveingilizce= (TextView) rootView.findViewById(R.id.meyveingilizce);
                meyvefotografi = (ImageView) rootView.findViewById(R.id.meyvefotografi);
                meyveturkce.setText("Kiraz");
                meyveingilizce.setText("Cherry");
                meyvefotografi.setImageResource(R.drawable.cherry);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpcherry.start();
                    }
                });
                return rootView;
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER) ==4) {
                View rootView = inflater.inflate(R.layout.fragment_fruits, container, false);
                meyveturkce = (TextView) rootView.findViewById(R.id.meyveturkce);
                meyveingilizce= (TextView) rootView.findViewById(R.id.meyveingilizce);
                meyvefotografi = (ImageView) rootView.findViewById(R.id.meyvefotografi);
                meyveturkce.setText("Hindistan Cevizi");
                meyveingilizce.setText("Coconut");
                meyvefotografi.setImageResource(R.drawable.coconut);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpcoconut.start();
                    }
                });
                return rootView;
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER) ==5) {
                View rootView = inflater.inflate(R.layout.fragment_fruits, container, false);
                meyveturkce = (TextView) rootView.findViewById(R.id.meyveturkce);
                meyveingilizce= (TextView) rootView.findViewById(R.id.meyveingilizce);
                meyvefotografi = (ImageView) rootView.findViewById(R.id.meyvefotografi);
                meyveturkce.setText("Üzüm");
                meyveingilizce.setText("Grape");
                meyvefotografi.setImageResource(R.drawable.grape);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpgrape.start();
                    }
                });
                return rootView;
            }
            else
            {
                View rootView = inflater.inflate(R.layout.fragment_fruits, container, false);
                meyveturkce = (TextView) rootView.findViewById(R.id.meyveturkce);
                meyveingilizce= (TextView) rootView.findViewById(R.id.meyveingilizce);
                meyvefotografi = (ImageView) rootView.findViewById(R.id.meyvefotografi);
                meyveturkce.setText("Kavun");
                meyveingilizce.setText("Melon");
                meyvefotografi.setImageResource(R.drawable.melon);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpmelon.start();
                    }
                });
                return rootView;
            }
        }

        @Override
        public void onDestroy() {
            super.onDestroy();
            mpapple.release();
            mpbanana.release();
            mpcherry.release();
            mpcoconut.release();
            mpgrape.release();
            mpmelon.release();
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 6;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "SECTION 1";
                case 1:
                    return "SECTION 2";
                case 2:
                    return "SECTION 3";
            }
            return null;
        }
    }
}
