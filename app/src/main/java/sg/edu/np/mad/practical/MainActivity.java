package sg.edu.np.mad.practical;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG, "on Create!!");
        User user = new User("john","Male",1,false);
        Button follow = findViewById(R.id.follow);
        if(user.Followed == false){
            follow.setText("Follow");
        }
        else{
            follow.setText("Unfollow");
        }
        follow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(user.Followed == false){
                    follow.setText("UnFollow");
                    user.Followed=true;
                }
                else
                {
                    user.Followed=false;
                    follow.setText("Follow");

                }
            }
        });
    }

}