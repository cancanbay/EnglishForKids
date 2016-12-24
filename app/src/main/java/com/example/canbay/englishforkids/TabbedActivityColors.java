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

public class TabbedActivityColors extends AppCompatActivity {

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

    static TextView renkturkce;
    static TextView renkingilizce;
    static ImageView renkfotografi;
    static ImageButton playbutton;
    static MediaPlayer mppurple;
    static MediaPlayer mpwhite;
    static MediaPlayer mpgreen;
    static MediaPlayer mppink;
    static MediaPlayer mpred;
    static MediaPlayer mpblue;
    static MediaPlayer mpyellow;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabbed_colors);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        mpblue = MediaPlayer.create(this,R.raw.blue);
        mpgreen= MediaPlayer.create(this,R.raw.green);
        mppink= MediaPlayer.create(this,R.raw.pink);
        mppurple= MediaPlayer.create(this,R.raw.purple);
        mpwhite= MediaPlayer.create(this,R.raw.white);
        mpred= MediaPlayer.create(this,R.raw.red);
        mpyellow= MediaPlayer.create(this,R.raw.yellow);


     /*   FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
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
        getMenuInflater().inflate(R.menu.menu_tabbed_activity_colors, menu);
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
                View rootView = inflater.inflate(R.layout.fragment_colors, container, false);
                renkturkce = (TextView) rootView.findViewById(R.id.renkturkce);
                renkingilizce= (TextView) rootView.findViewById(R.id.renkingilizce);
                renkfotografi = (ImageView) rootView.findViewById(R.id.renkfotografi);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpblue.start();
                    }
                });
                return rootView;
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER) ==2) {
                View rootView = inflater.inflate(R.layout.fragment_colors, container, false);
                renkturkce = (TextView) rootView.findViewById(R.id.renkturkce);
                renkingilizce= (TextView) rootView.findViewById(R.id.renkingilizce);
                renkfotografi = (ImageView) rootView.findViewById(R.id.renkfotografi);
                renkturkce.setText("Yeşil");
                renkingilizce.setText("Green");
                renkfotografi.setImageResource(R.drawable.green);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpgreen.start();
                    }
                });
                return rootView;
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER) ==3) {
                View rootView = inflater.inflate(R.layout.fragment_colors, container, false);
                renkturkce = (TextView) rootView.findViewById(R.id.renkturkce);
                renkingilizce= (TextView) rootView.findViewById(R.id.renkingilizce);
                renkfotografi = (ImageView) rootView.findViewById(R.id.renkfotografi);
                renkturkce.setText("Kırmızı");
                renkingilizce.setText("Red");
                renkfotografi.setImageResource(R.drawable.red);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpred.start();
                    }
                });
                return rootView;
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER) ==4) {
                View rootView = inflater.inflate(R.layout.fragment_colors, container, false);
                renkturkce = (TextView) rootView.findViewById(R.id.renkturkce);
                renkingilizce= (TextView) rootView.findViewById(R.id.renkingilizce);
                renkfotografi = (ImageView) rootView.findViewById(R.id.renkfotografi);
                renkturkce.setText("Mor");
                renkingilizce.setText("Purple");
                renkfotografi.setImageResource(R.drawable.purple);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mppurple.start();
                    }
                });
                return rootView;
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER) ==5) {
                View rootView = inflater.inflate(R.layout.fragment_colors, container, false);
                renkturkce = (TextView) rootView.findViewById(R.id.renkturkce);
                renkingilizce= (TextView) rootView.findViewById(R.id.renkingilizce);
                renkfotografi = (ImageView) rootView.findViewById(R.id.renkfotografi);
                renkturkce.setText("Pembe");
                renkingilizce.setText("Pink");
                renkfotografi.setImageResource(R.drawable.pink);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mppink.start();
                    }
                });
                return rootView;
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER) ==6) {
                View rootView = inflater.inflate(R.layout.fragment_colors, container, false);
                renkturkce = (TextView) rootView.findViewById(R.id.renkturkce);
                renkingilizce= (TextView) rootView.findViewById(R.id.renkingilizce);
                renkfotografi = (ImageView) rootView.findViewById(R.id.renkfotografi);
                renkturkce.setText("Beyaz");
                renkingilizce.setText("White");
                renkfotografi.setImageResource(R.drawable.white);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpwhite.start();
                    }
                });
                return rootView;
            }
            else
            {
                View rootView = inflater.inflate(R.layout.fragment_colors, container, false);
                renkturkce = (TextView) rootView.findViewById(R.id.renkturkce);
                renkingilizce= (TextView) rootView.findViewById(R.id.renkingilizce);
                renkfotografi = (ImageView) rootView.findViewById(R.id.renkfotografi);
                renkturkce.setText("Sarı");
                renkingilizce.setText("Yellow");
                renkfotografi.setImageResource(R.drawable.yellow);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpyellow.start();
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
            }
            return null;
        }
    }
}
