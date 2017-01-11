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

public class TabbedActivityAnimals extends AppCompatActivity {

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
    static MediaPlayer mpcow;
    static MediaPlayer mpdog;
    static MediaPlayer mpdonkey;
    static MediaPlayer mpelephant;
    static MediaPlayer mpfrog;
    static MediaPlayer mpgoat;
    static MediaPlayer mphorse;
    static MediaPlayer mplion;
    static MediaPlayer mprooster;
    static TextView hayvanturkce;
    static TextView hayvaningilizce;
    static ImageView hayvanfotografi;
    static ImageButton playbutton;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabbed_animals);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        mpcow = MediaPlayer.create(this,R.raw.cow);
        mpdog= MediaPlayer.create(this,R.raw.dog);
        mpdonkey= MediaPlayer.create(this,R.raw.donkey);
        mpelephant= MediaPlayer.create(this,R.raw.elephant);
        mpfrog= MediaPlayer.create(this,R.raw.frog);
        mpgoat= MediaPlayer.create(this,R.raw.goat);
        mphorse= MediaPlayer.create(this,R.raw.horse);
        mplion= MediaPlayer.create(this,R.raw.lion);
        mprooster= MediaPlayer.create(this,R.raw.rooster);



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
        getMenuInflater().inflate(R.menu.menu_tabbed_activity_animals, menu);
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
                View rootView = inflater.inflate(R.layout.fragment_animals, container, false);
                hayvanturkce = (TextView) rootView.findViewById(R.id.hayvanturkce);
                hayvaningilizce = (TextView) rootView.findViewById(R.id.hayvaningilizce);
                hayvanfotografi= (ImageView) rootView.findViewById(R.id.hayvanfotografi);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpcow.start();
                    }
                });
                return rootView;
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER) ==2) {
                View rootView = inflater.inflate(R.layout.fragment_animals, container, false);
                hayvanturkce = (TextView) rootView.findViewById(R.id.hayvanturkce);
                hayvaningilizce = (TextView) rootView.findViewById(R.id.hayvaningilizce);
                hayvanfotografi= (ImageView) rootView.findViewById(R.id.hayvanfotografi);
                hayvanturkce.setText("Köpek");
                hayvaningilizce.setText("Dog");
                hayvanfotografi.setImageResource(R.drawable.dog);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpdog.start();
                    }
                });
                return rootView;
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER) ==3) {
                View rootView = inflater.inflate(R.layout.fragment_animals, container, false);
                hayvanturkce = (TextView) rootView.findViewById(R.id.hayvanturkce);
                hayvaningilizce = (TextView) rootView.findViewById(R.id.hayvaningilizce);
                hayvanfotografi= (ImageView) rootView.findViewById(R.id.hayvanfotografi);
                hayvanturkce.setText("Eşek");
                hayvaningilizce.setText("Donkey");
                hayvanfotografi.setImageResource(R.drawable.donkey);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpdonkey.start();
                    }
                });
                return rootView;
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER) ==4) {
                View rootView = inflater.inflate(R.layout.fragment_animals, container, false);
                hayvanturkce = (TextView) rootView.findViewById(R.id.hayvanturkce);
                hayvaningilizce = (TextView) rootView.findViewById(R.id.hayvaningilizce);
                hayvanfotografi= (ImageView) rootView.findViewById(R.id.hayvanfotografi);
                hayvanturkce.setText("Fil");
                hayvaningilizce.setText("Elephant");
                hayvanfotografi.setImageResource(R.drawable.elephant);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpelephant.start();
                    }
                });
                return rootView;
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER) ==5) {
                View rootView = inflater.inflate(R.layout.fragment_animals, container, false);
                hayvanturkce = (TextView) rootView.findViewById(R.id.hayvanturkce);
                hayvaningilizce = (TextView) rootView.findViewById(R.id.hayvaningilizce);
                hayvanfotografi= (ImageView) rootView.findViewById(R.id.hayvanfotografi);
                hayvanturkce.setText("Kurbağa");
                hayvaningilizce.setText("Frog");
                hayvanfotografi.setImageResource(R.drawable.frog);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpfrog.start();
                    }
                });
                return rootView;
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER) ==6) {
                View rootView = inflater.inflate(R.layout.fragment_animals, container, false);
                hayvanturkce = (TextView) rootView.findViewById(R.id.hayvanturkce);
                hayvaningilizce = (TextView) rootView.findViewById(R.id.hayvaningilizce);
                hayvanfotografi= (ImageView) rootView.findViewById(R.id.hayvanfotografi);
                hayvanturkce.setText("Keçi");
                hayvaningilizce.setText("Goat");
                hayvanfotografi.setImageResource(R.drawable.goat);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpgoat.start();
                    }
                });
                return rootView;
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER) ==7) {
                View rootView = inflater.inflate(R.layout.fragment_animals, container, false);
                hayvanturkce = (TextView) rootView.findViewById(R.id.hayvanturkce);
                hayvaningilizce = (TextView) rootView.findViewById(R.id.hayvaningilizce);
                hayvanfotografi= (ImageView) rootView.findViewById(R.id.hayvanfotografi);
                hayvanturkce.setText("At");
                hayvaningilizce.setText("Horse");
                hayvanfotografi.setImageResource(R.drawable.horse);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mphorse.start();
                    }
                });
                return rootView;
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER) ==8) {
                View rootView = inflater.inflate(R.layout.fragment_animals, container, false);
                hayvanturkce = (TextView) rootView.findViewById(R.id.hayvanturkce);
                hayvaningilizce = (TextView) rootView.findViewById(R.id.hayvaningilizce);
                hayvanfotografi= (ImageView) rootView.findViewById(R.id.hayvanfotografi);
                hayvanturkce.setText("Aslan");
                hayvaningilizce.setText("Lion");
                hayvanfotografi.setImageResource(R.drawable.lion);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mplion.start();
                    }
                });
                return rootView;
            }
            else{
                View rootView = inflater.inflate(R.layout.fragment_animals, container, false);
                hayvanturkce = (TextView) rootView.findViewById(R.id.hayvanturkce);
                hayvaningilizce = (TextView) rootView.findViewById(R.id.hayvaningilizce);
                hayvanfotografi= (ImageView) rootView.findViewById(R.id.hayvanfotografi);
                hayvanturkce.setText("Horoz");
                hayvaningilizce.setText("Rooster");
                hayvanfotografi.setImageResource(R.drawable.rooster);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mprooster.start();
                    }
                });
                return rootView;
            }

        }

        @Override
        public void onDestroy() {
            super.onDestroy();
            mpgoat.release();
            mpdonkey.release();
            mpcow.release();
            mpdog.release();
            mpelephant.release();
            mpfrog.release();
            mphorse.release();
            mplion.release();
            mprooster.release();
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
            return 9;
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
