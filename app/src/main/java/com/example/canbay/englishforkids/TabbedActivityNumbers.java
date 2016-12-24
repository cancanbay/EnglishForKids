package com.example.canbay.englishforkids;

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

public class TabbedActivityNumbers extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    static MediaPlayer mpone;
    static MediaPlayer mptwo;
    static MediaPlayer mpthree;
    static MediaPlayer mpfour;
    static MediaPlayer mpfive;
    static MediaPlayer mpsix;
    static MediaPlayer mpseven;
    static MediaPlayer mpeight;
    static MediaPlayer mpnine;
    static MediaPlayer mpten;
    static TextView sayiturkce;
    static TextView sayingilizce;
    static ImageView sayifotografi;
    static ImageButton playbutton;
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabbed_numbers);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        mpone = MediaPlayer.create(this,R.raw.one);
        mptwo= MediaPlayer.create(this,R.raw.two);
        mpthree= MediaPlayer.create(this,R.raw.three);
        mpfour= MediaPlayer.create(this,R.raw.four);
        mpfive= MediaPlayer.create(this,R.raw.five);
        mpsix= MediaPlayer.create(this,R.raw.six);
        mpseven= MediaPlayer.create(this,R.raw.seven);
        mpeight= MediaPlayer.create(this,R.raw.eight);
        mpnine= MediaPlayer.create(this,R.raw.nine);
        mpten= MediaPlayer.create(this,R.raw.ten);


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
        getMenuInflater().inflate(R.menu.menu_tabbed_activity_numbers, menu);
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
                View rootView = inflater.inflate(R.layout.fragment_numbers, container, false);
                sayiturkce = (TextView) rootView.findViewById(R.id.sayiturkce);
                sayingilizce = (TextView) rootView.findViewById(R.id.sayiingilizce);
                sayifotografi = (ImageView) rootView.findViewById(R.id.sayifotografi);
                sayifotografi.setImageResource(R.drawable._1);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpone.start();
                    }
                });
                return rootView;
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER) ==2) {
                View rootView = inflater.inflate(R.layout.fragment_numbers, container, false);
                sayiturkce = (TextView) rootView.findViewById(R.id.sayiturkce);
                sayingilizce = (TextView) rootView.findViewById(R.id.sayiingilizce);
                sayifotografi = (ImageView) rootView.findViewById(R.id.sayifotografi);
                sayiturkce.setText("İki");
                sayingilizce.setText("Two");
                sayifotografi.setImageResource(R.drawable._2);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mptwo.start();
                    }
                });
                return rootView;
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER) ==3) {
                View rootView = inflater.inflate(R.layout.fragment_numbers, container, false);
                sayiturkce = (TextView) rootView.findViewById(R.id.sayiturkce);
                sayingilizce = (TextView) rootView.findViewById(R.id.sayiingilizce);
                sayifotografi = (ImageView) rootView.findViewById(R.id.sayifotografi);
                sayiturkce.setText("Üç");
                sayingilizce.setText("Three");
                sayifotografi.setImageResource(R.drawable._3);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpthree.start();
                    }
                });
                return rootView;
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER) ==4) {
                View rootView = inflater.inflate(R.layout.fragment_numbers, container, false);
                sayiturkce = (TextView) rootView.findViewById(R.id.sayiturkce);
                sayingilizce = (TextView) rootView.findViewById(R.id.sayiingilizce);
                sayifotografi = (ImageView) rootView.findViewById(R.id.sayifotografi);
                sayiturkce.setText("Dört");
                sayingilizce.setText("Four");
                sayifotografi.setImageResource(R.drawable._4);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpfour.start();
                    }
                });
                return rootView;
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER) ==5) {
                View rootView = inflater.inflate(R.layout.fragment_numbers, container, false);
                sayiturkce = (TextView) rootView.findViewById(R.id.sayiturkce);
                sayingilizce = (TextView) rootView.findViewById(R.id.sayiingilizce);
                sayifotografi = (ImageView) rootView.findViewById(R.id.sayifotografi);
                sayiturkce.setText("Beş");
                sayingilizce.setText("Five");
                sayifotografi.setImageResource(R.drawable._5);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpfive.start();
                    }
                });
                return rootView;
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER) ==6) {
                View rootView = inflater.inflate(R.layout.fragment_numbers, container, false);
                sayiturkce = (TextView) rootView.findViewById(R.id.sayiturkce);
                sayingilizce = (TextView) rootView.findViewById(R.id.sayiingilizce);
                sayifotografi = (ImageView) rootView.findViewById(R.id.sayifotografi);
                sayiturkce.setText("Altı");
                sayingilizce.setText("Six");
                sayifotografi.setImageResource(R.drawable._6);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpsix.start();
                    }
                });
                return rootView;
            }

            else if(getArguments().getInt(ARG_SECTION_NUMBER) ==7) {
                View rootView = inflater.inflate(R.layout.fragment_numbers, container, false);
                sayiturkce = (TextView) rootView.findViewById(R.id.sayiturkce);
                sayingilizce = (TextView) rootView.findViewById(R.id.sayiingilizce);
                sayifotografi = (ImageView) rootView.findViewById(R.id.sayifotografi);
                sayiturkce.setText("Yedi");
                sayingilizce.setText("Seven");
                sayifotografi.setImageResource(R.drawable._7);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpseven.start();
                    }
                });
                return rootView;
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER) ==8) {
                View rootView = inflater.inflate(R.layout.fragment_numbers, container, false);
                sayiturkce = (TextView) rootView.findViewById(R.id.sayiturkce);
                sayingilizce = (TextView) rootView.findViewById(R.id.sayiingilizce);
                sayifotografi = (ImageView) rootView.findViewById(R.id.sayifotografi);
                sayiturkce.setText("Sekiz");
                sayingilizce.setText("Eight");
                sayifotografi.setImageResource(R.drawable._8);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpeight.start();
                    }
                });
                return rootView;
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER) ==9) {
                View rootView = inflater.inflate(R.layout.fragment_numbers, container, false);
                sayiturkce = (TextView) rootView.findViewById(R.id.sayiturkce);
                sayingilizce = (TextView) rootView.findViewById(R.id.sayiingilizce);
                sayifotografi = (ImageView) rootView.findViewById(R.id.sayifotografi);
                sayiturkce.setText("Dokuz");
                sayingilizce.setText("Nine");
                sayifotografi.setImageResource(R.drawable._9);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpnine.start();
                    }
                });
                return rootView;
            }
            else {
                    View rootView = inflater.inflate(R.layout.fragment_numbers, container, false);
                    sayiturkce = (TextView) rootView.findViewById(R.id.sayiturkce);
                    sayingilizce = (TextView) rootView.findViewById(R.id.sayiingilizce);
                    sayifotografi = (ImageView) rootView.findViewById(R.id.sayifotografi);
                    sayiturkce.setText("On");
                    sayingilizce.setText("Ten");
                    sayifotografi.setImageResource(R.drawable._10);
                    playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                    playbutton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mpten.start();
                        }
                    });
                    return rootView;
            }

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
                case 3:
                    return "SECTION 4";
                case 4:
                    return "SECTION 5";
                case 5:
                    return "SECTION 6";
                case 6:
                    return "SECTION 7";
                case 7:
                    return "SECTION 8";
                case 8:
                    return "SECTION 9";
                case 9:
                    return "SECTION 10";
            }
            return null;
        }
    }
}
