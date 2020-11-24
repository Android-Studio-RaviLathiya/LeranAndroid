package com.coin.leranandroid.ReadMore;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.borjabravo.readmoretextview.ReadMoreTextView;
import com.coin.leranandroid.R;

public class ReadMoreActivity extends AppCompatActivity {

    private ReadMoreTextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_more);
        initView();

        textView.setText("Unless required by applicable law or agreed to in writing, software\n" +
                "distributed under the License is distributed on an \"AS IS\" BASIS,\n" +
                "WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n" +
                "See the License for the specific language governing permissions and\n" +
                "limitations under the License");

        textView.setTrimCollapsedText("Show More");
        textView.setTrimExpandedText("Show Less");

        textView.setTrimLength(20);
        textView.setTrimLines(5);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    private void initView() {
        textView = findViewById(R.id.text_view);
        button = findViewById(R.id.button);
    }
}