package com.example.canbay.englishforkids;

/**
 * Created by canbay on 24.12.2016.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.ImageView;


/**
 * Created by alfiroj on 5/13/16.
 */
public class DBAdapter extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "CocuklarIcinIngilizceQuiz";

    // Table name
    private static final String TABLE_QUESTION = "question";

    // Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_QUESION = "question";
    private static final String KEY_QUESION_Imageid = "imageid";
    private static final String KEY_ANSWER = "answer"; //correct option
    private static final String KEY_OPTA= "opta"; //option a
    private static final String KEY_OPTB= "optb"; //option b
    private static final String KEY_OPTC= "optc"; //option c
    private static final String KEY_OPTD= "optd"; //option d


    private SQLiteDatabase myDatabase;

    public DBAdapter(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
         myDatabase=db;
        String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUESTION + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +KEY_QUESION_Imageid + " INTEGER ,"+ KEY_QUESION
                + " TEXT, " + KEY_ANSWER+ " TEXT, "+KEY_OPTA +" TEXT, "
                +KEY_OPTB +" TEXT, "+KEY_OPTC +" TEXT, "+KEY_OPTD+" TEXT)";

        db.execSQL(sql);

        addQuestionsWithImage();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUESTION);

        // Create tables again
        onCreate(db);
    }

    public int rowCount()
    {
        int row=0;
        String selectQuery = "SELECT  * FROM " + TABLE_QUESTION;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        row=cursor.getCount();
        return row;
    }
    static List<Question> copy;
    // copying random list to the see true/wrong answers..
    public static List<Question> pickNRandom(List<Question> lst, int n) {
        copy = new ArrayList<Question>(lst);
        Collections.shuffle(copy);
        return copy.subList(0, n);
    }

    static List<Question> quesList;
    public List<Question> getRandomQuestions() {

        int i=0;
        quesList= new ArrayList<Question>();
        List<Question> randomList;

        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_QUESTION;
        myDatabase=this.getReadableDatabase();

        Cursor cursor = myDatabase.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToNext()) {
            do {
                Question quest = new Question();
                quest.setId(cursor.getInt(0));
                quest.setQUESTIONImageId(cursor.getInt(1));
                quest.setQUESTION(cursor.getString(2));
                quest.setANSWER(cursor.getString(3));
                quest.setOptionA(cursor.getString(4));
                quest.setOptionB(cursor.getString(5));
                quest.setOptionC(cursor.getString(6));
                quest.setOptionD(cursor.getString(7));

                quesList.add(quest);


            } while (cursor.moveToNext());

        }
        // return quest list
        randomList = pickNRandom(quesList,10);
        copy = new ArrayList<Question>(randomList);
        copy.subList(0,10);
        return randomList;
    }

    public static List<Question> getQuestionList(){
        return copy;
    }

    private void addQuestionsWithImage()
    {
        // adding new questions
        //format is question-option1-option2-option3-option4-answer

        Question q1=new Question(R.drawable.apple,"Yukarıdaki meyvenin ingilizcesi aşağıdakilerden hangisidir?","Grape", "Apple", "Raspberry", "Melon","Apple");
        this.addQuestionWithImage(q1);

        Question q2=new Question(R.drawable._8,"Yukarıdaki sayının ingilizcesi aşağıdakilerden hangisidir?","Nine", "Two", "Three", "Eight","Eight");
        this.addQuestionWithImage(q2);

        Question q3=new Question(R.drawable.pencilsharpener,"Yukarıdaki okul eşyasının ingilizcesi aşağıdakilerden hangisidir?","Desk", "Table", "Pencil Sharpener", "Pencil","Pencil Sharpener");
        this.addQuestionWithImage(q3);

        Question q4=new Question(R.drawable.red,"Yukarıdaki hayvanın rengi nedir?","Red", "Blue", "Yellow", "White","Red");
        this.addQuestionWithImage(q4);

        Question q5=new Question(R.drawable._3,"Yukarıdaki sayının ingilizcesi aşağıdakilerden hangisidir?","Four", "Nine", "Seven", "Three","Three");
        this.addQuestionWithImage(q5);

        Question q6=new Question(R.drawable.banana,"Yukarıdaki meyvenin ingilizcesi aşağıdakilerden hangisidir?","Grapefruit", "Watermelon", "Banana", "Apple","Banana");
        this.addQuestionWithImage(q6);

        Question q7=new Question(R.drawable.coconut,"Yukarıdaki meyvenin ingilizcesi aşağıdakilerden hangisidir?","Grape", "Apple", "Coconut", "Banana","Coconut");
        this.addQuestionWithImage(q7);

        Question q8=new Question(R.drawable._5,"Yukarıdaki sayının ingilizcesi aşağıdakilerden hangisidir?","Five", "Two", "Four", "Eight","Five");
        this.addQuestionWithImage(q8);

        Question q9=new Question(R.drawable.bag,"Yukarıdaki okul eşyasının ingilizcesi aşağıdakilerden hangisidir?","Desk", "Bag", "Chalk", "Pencil","Bag");
        this.addQuestionWithImage(q9);

        Question q10=new Question(R.drawable.white,"Yukarıdaki hayvanın rengi nedir?","Black", "Yellow", "Green", "White","White");
        this.addQuestionWithImage(q10);

        Question q11=new Question(R.drawable._7,"Yukarıdaki sayının ingilizcesi aşağıdakilerden hangisidir?","Seven", "Nine", "Four", "Three","Seven");
        this.addQuestionWithImage(q11);

        Question q12=new Question(R.drawable.pazartesi,"Yukarıdaki günün türkçesi aşağıdakilerden hangisidir?","Pazar", "Perşembe", "Cuma", "Pazartesi","Pazartesi");
        this.addQuestionWithImage(q12);

        Question q13=new Question(R.drawable.sali,"Yukarıdaki günün türkçesi aşağıdakilerden hangisidir?","Salı", "Pazar", "Çarşamba", "Pazartesi","Salı");
        this.addQuestionWithImage(q13);

        Question q14=new Question(R.drawable.cumartesi,"Yukarıdaki günün türkçesi aşağıdakilerden hangisidir?","Pazartesi", "Cuma", "Pazar", "Cumartesi","Cumartesi");
        this.addQuestionWithImage(q14);

        Question q15=new Question(R.drawable.carsamba,"Yukarıdaki günün türkçesi aşağıdakilerden hangisidir?","Pazar", "Çarşamba", "Cuma", "Pazartesi","Çarşamba");
        this.addQuestionWithImage(q15);

        Question q16=new Question(R.drawable.blue,"Yukarıdaki hayvanın rengi nedir?","Black", "Blue", "Green", "White","Blue");
        this.addQuestionWithImage(q16);

        Question q17=new Question(R.drawable._9,"Yukarıdaki sayının ingilizcesi aşağıdakilerden hangisidir?","Nine", "Ten", "Seven", "Four" ,"Nine");
        this.addQuestionWithImage(q17);

        Question q18=new Question(R.drawable.cherry,"Yukarıdaki meyvenin ingilizcesi aşağıdakilerden hangisidir?","Cherry", "Watermelon", "Melon", "Apple","Cherry");
        this.addQuestionWithImage(q18);

        Question q19=new Question(R.drawable.eraser,"Yukarıdaki eşyanın ingilizcesi aşağıdakilerden hangisidir?","Chalk", "Desk", "Eraser", "Table","Eraser");
        this.addQuestionWithImage(q19);

        Question q20=new Question(R.drawable._1,"Yukarıdaki sayının ingilizcesi aşağıdakilerden hangisidir?","One", "Two", "Seven", "Nine","One");
        this.addQuestionWithImage(q20);

        Question q21=new Question(R.drawable.camera,"Yukarıdaki eşyanın ingilizcesi aşağıdakilerden hangisidir?","Car", "Door", "Computer", "Camera","Camera");
        this.addQuestionWithImage(q21);

        Question q22=new Question(R.drawable.yellow,"Yukarıdaki hayvanın rengi nedir?","Red", "Brown", "Yellow", "Blue","Yellow");
        this.addQuestionWithImage(q22);

        Question q23=new Question(R.drawable._2,"Yukarıdaki sayının ingilizcesi aşağıdakilerden hangisidir?","Four", "Nine", "Two", "Ten","Two");
        this.addQuestionWithImage(q23);

        Question q24=new Question(R.drawable.grape,"Yukarıdaki meyvenin ingilizcesi aşağıdakilerden hangisidir?","Grape", "Melon", "Apple", "Blueberry","Grape");
        this.addQuestionWithImage(q24);

        Question q25=new Question(R.drawable.rooster,"Yukarıdaki hayvanın ingilizcesi aşağıdakilerden hangisidir?","Dog", "Monkey", "Donkey", "Rooster","Rooster");
        this.addQuestionWithImage(q25);

        Question q26=new Question(R.drawable._5,"Yukarıdaki sayının ingilizcesi aşağıdakilerden hangisidir?","Five", "Two", "Four", "Twelve","Five");
        this.addQuestionWithImage(q26);

        Question q27=new Question(R.drawable.microscope,"Yukarıdaki eşyanın ingilizcesi aşağıdakilerden hangisidir?","Car", "Microscope", "Pencil Sharpener", "Phone","Microscope");
        this.addQuestionWithImage(q27);

        Question q28=new Question(R.drawable.green,"Yukarıdaki hayvanın rengi nedir?","Red", "Blue", "Green", "White","Green");
        this.addQuestionWithImage(q28);

        Question q29=new Question(R.drawable._4,"Yukarıdaki sayının ingilizcesi aşağıdakilerden hangisidir?","Four", "Seven", "Eight", "Three","Four");
        this.addQuestionWithImage(q29);

        Question q30=new Question(R.drawable.donkey,"Yukarıdaki hayvanın ingilizcesi aşağıdakilerden hangisidir?","Monkey", "Donkey", "Rooster", "Cat","Donkey");
        this.addQuestionWithImage(q30);

    }

    // Adding new question

    public void addQuestionWithImage(Question quest) {

        // Inserting attributes to the table Question
        ContentValues values = new ContentValues();
        values.put(KEY_QUESION_Imageid,quest.getQUESTIONImageId());
        values.put(KEY_QUESION, quest.getQUESTION());
        values.put(KEY_ANSWER, quest.getANSWER());
        values.put(KEY_OPTA, quest.getOptionA());
        values.put(KEY_OPTB, quest.getOptionB());
        values.put(KEY_OPTC, quest.getOptionC());
        values.put(KEY_OPTD, quest.getOptionD());

        // Inserting Row
        myDatabase.insert(TABLE_QUESTION, null, values);
    }


}
