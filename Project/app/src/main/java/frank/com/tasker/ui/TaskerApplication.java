package frank.com.tasker.ui;

import android.app.Application;

import com.parse.Parse;

public class TaskerApplication extends Application{
    @Override
    public void onCreate()
    {
        super.onCreate();

        // [Optional] Power your app with Local Datastore. For more info, go to
        // https://parse.com/docs/android/guide#local-datastore
        Parse.enableLocalDatastore(this);

        Parse.initialize(this);
    }
}
