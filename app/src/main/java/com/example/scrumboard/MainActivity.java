package com.example.scrumboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;
    private Button button17;
    private Button button18;
    private Button button19;
    private Button button20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity2();
            }
        });
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity3();
            }
        });
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity4();
            }
        });


        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity5();
            }
        });
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity6();
            }
        });
        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity8();
            }
        });
        button6= (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity7();
            }
        });

        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity9();
            }
        });
        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity10();
            }
        });

        button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity11();
            }
        });
        button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity12();
            }
        });


        button12 = (Button) findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity13();
            }
        });

        button13 = (Button) findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity14();
            }
        });

        button14 = (Button) findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity15();
            }
        });

        button15 = (Button) findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity16();
            }
        });

        button16 = (Button) findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity17();
            }
        });
        button17 = (Button) findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity18();
            }
        });

        button19 = (Button) findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity20();
            }
        });
        button18 = (Button) findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity19();
            }
        });

        button20 = (Button) findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity21();
            }
        });



    }

    public void openMainActivity2() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void openMainActivity5() {
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);

    }

    public void openMainActivity4() {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);

    }

    public void openMainActivity3() {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);

    }

    public void openMainActivity9() {
        Intent intent = new Intent(this, MainActivity9.class);
        startActivity(intent);

    }

    public void openMainActivity8() {
        Intent intent = new Intent(this, MainActivity8.class);
        startActivity(intent);


    }
    public void openMainActivity7() {
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);


    }
    public void openMainActivity6() {
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);


    }
    public void openMainActivity13() {
        Intent intent = new Intent(this, MainActivity13.class);
        startActivity(intent);


    }
    public void openMainActivity12() {
        Intent intent = new Intent(this, MainActivity12.class);
        startActivity(intent);


    }
    public void openMainActivity11() {
        Intent intent = new Intent(this, MainActivity11.class);
        startActivity(intent);


    }
    public void openMainActivity10() {
        Intent intent = new Intent(this, MainActivity10.class);
        startActivity(intent);


    }
    public void openMainActivity17() {
        Intent intent = new Intent(this, MainActivity17.class);
        startActivity(intent);


    }
    public void openMainActivity16() {
        Intent intent = new Intent(this, MainActivity16.class);
        startActivity(intent);


    }
    public void openMainActivity15() {
        Intent intent = new Intent(this, MainActivity15.class);
        startActivity(intent);


    }
    public void openMainActivity14() {
        Intent intent = new Intent(this, MainActivity14.class);
        startActivity(intent);


    }
    public void openMainActivity21() {
        Intent intent = new Intent(this, MainActivity21.class);
        startActivity(intent);


    }
    public void openMainActivity20() {
        Intent intent = new Intent(this, MainActivity20.class);
        startActivity(intent);


    }
    public void openMainActivity19() {
        Intent intent = new Intent(this, MainActivity19.class);
        startActivity(intent);


    }
    public void openMainActivity18() {
        Intent intent = new Intent(this, MainActivity18.class);
        startActivity(intent);


    }


}


