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

public class TabbedActivityDays extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    static MediaPlayer mpsunday;
    static MediaPlayer mpmonday;
    static MediaPlayer mptuesday;
    static MediaPlayer mpwednesday;
    static MediaPlayer mpthursday;
    static MediaPlayer mpfriday;
    static MediaPlayer mpsaturday;
    private SectionsPagerAdapter mSectionsPagerAdapter;
    static TextView gunturkce;
    static TextView guningilizce;
    static ImageView gunfotografi;
    static ImageButton playbutton;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabbed_days);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        mpmonday = MediaPlayer.create(this,R.raw.monday);
        mptuesday = MediaPlayer.create(this,R.raw.tuesday);
        mpwednesday = MediaPlayer.create(this,R.raw.wednesday);
        mpthursday = MediaPlayer.create(this,R.raw.thursday);
        mpfriday = MediaPlayer.create(this,R.raw.friday);
        mpsaturday = MediaPlayer.create(this,R.raw.saturday);
        mpsunday = MediaPlayer.create(this,R.raw.sunday);




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
        getMenuInflater().inflate(R.menu.menu_tabbed, menu);
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
                View rootView = inflater.inflate(R.layout.fragment_days, container, false);
                 gunturkce = (TextView) rootView.findViewById(R.id.gunturkce);
                 guningilizce = (TextView) rootView.findViewById(R.id.guningilizce);
                 gunfotografi = (ImageView) rootView.findViewById(R.id.gunfotografi);
                 playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                 playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpmonday.start();
                    }
                });
            return rootView;
            }
             else if(getArguments().getInt(ARG_SECTION_NUMBER) ==2) {
                View rootView = inflater.inflate(R.layout.fragment_days, container, false);
                gunturkce = (TextView) rootView.findViewById(R.id.gunturkce);
                guningilizce = (TextView) rootView.findViewById(R.id.guningilizce);
                gunfotografi = (ImageView) rootView.findViewById(R.id.gunfotografi);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                gunturkce.setText("Salı");
                guningilizce.setText("Tuesday");
                gunfotografi.setImageResource(R.drawable.sali);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mptuesday.start();
                    }
                });
                return rootView;
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER) ==3) {
                View rootView = inflater.inflate(R.layout.fragment_days, container, false);
                gunturkce = (TextView) rootView.findViewById(R.id.gunturkce);
                guningilizce = (TextView) rootView.findViewById(R.id.guningilizce);
                gunfotografi = (ImageView) rootView.findViewById(R.id.gunfotografi);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                gunturkce.setText("Çarşamba");
                guningilizce.setText("Wednesday");
                gunfotografi.setImageResource(R.drawable.carsamba);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpwednesday.start();
                    }
                });
                return rootView;
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER) ==4) {
                View rootView = inflater.inflate(R.layout.fragment_days, container, false);
                gunturkce = (TextView) rootView.findViewById(R.id.gunturkce);
                guningilizce = (TextView) rootView.findViewById(R.id.guningilizce);
                gunfotografi = (ImageView) rootView.findViewById(R.id.gunfotografi);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                gunturkce.setText("Perşembe");
                guningilizce.setText("Thursday");
                gunfotografi.setImageResource(R.drawable.persembe);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpthursday.start();
                    }
                });
                return rootView;
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER) ==5) {
                View rootView = inflater.inflate(R.layout.fragment_days, container, false);
                gunturkce = (TextView) rootView.findViewById(R.id.gunturkce);
                guningilizce = (TextView) rootView.findViewById(R.id.guningilizce);
                gunfotografi = (ImageView) rootView.findViewById(R.id.gunfotografi);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                gunturkce.setText("Cuma");
                guningilizce.setText("Friday");
                gunfotografi.setImageResource(R.drawable.cuma);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpfriday.start();
                    }
                });
                return rootView;
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER) ==6) {
                View rootView = inflater.inflate(R.layout.fragment_days, container, false);
                gunturkce = (TextView) rootView.findViewById(R.id.gunturkce);
                guningilizce = (TextView) rootView.findViewById(R.id.guningilizce);
                gunfotografi = (ImageView) rootView.findViewById(R.id.gunfotografi);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                gunturkce.setText("Cumartesi");
                guningilizce.setText("Saturday");
                gunfotografi.setImageResource(R.drawable.cumartesi);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpsaturday.start();
                    }
                });
                return rootView;
            }
            else
            {
                View rootView = inflater.inflate(R.layout.fragment_days, container, false);
                gunturkce = (TextView) rootView.findViewById(R.id.gunturkce);
                guningilizce = (TextView) rootView.findViewById(R.id.guningilizce);
                gunfotografi = (ImageView) rootView.findViewById(R.id.gunfotografi);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                gunturkce.setText("Pazar");
                guningilizce.setText("Monday");
                gunfotografi.setImageResource(R.drawable.pazar);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpsunday.start();
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
            return 7;
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
            }
            return null;
        }
    }
}
