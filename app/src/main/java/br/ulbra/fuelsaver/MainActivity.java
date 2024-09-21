
    package br.ulbra.fuelsaver;

    import android.app.Activity;
    import android.os.Bundle;


    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.ImageView;
    import android.widget.TextView;
    import android.widget.Toast;

    public class MainActivity extends Activity {

        private TextView fuel_saver, txtCriador;
        private ImageView itinerary, rectangle_1, fuel_gas, licence_plate, speedometer, car, cash, real_ek1, gas_pump;
        private View _bg__component_ek2;
        private TextView txtFuelSaver, txtR1, txtR2;
        private EditText editNomeV, editNumeroP, editDistancia, editKmL, editValorC;
        private Button btnCalcular;


        @Override
        public void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            _bg__component_ek2 = (View) findViewById(R.id._bg__component_ek2);
            rectangle_1 = (ImageView) findViewById(R.id.rectangle_1);
            fuel_saver = (TextView) findViewById(R.id.txtFuelSaver);
            itinerary = (ImageView) findViewById(R.id.itinerary);
            fuel_gas = (ImageView) findViewById(R.id.fuel_gas);
            licence_plate = (ImageView) findViewById(R.id.licence_plate);
            speedometer = (ImageView) findViewById(R.id.speedometer);
            car = (ImageView) findViewById(R.id.car);
            cash = (ImageView) findViewById(R.id.cash);
            real_ek1 = (ImageView) findViewById(R.id.real_ek1);
            gas_pump = (ImageView) findViewById(R.id.gas_pump);
            _bg__component_ek2 = (View) findViewById(R.id._bg__component_ek2);
            editNomeV = (EditText) findViewById(R.id.editNomeV);
            editNumeroP = (EditText) findViewById(R.id.editNumeroP);
            editDistancia = (EditText) findViewById(R.id.editDistancia);
            editKmL = (EditText) findViewById(R.id.editKml);
            editValorC = (EditText) findViewById(R.id.editValorC);
            txtR1 = (TextView) findViewById(R.id.txtR1);
            txtR2 = (TextView) findViewById(R.id.txtR2);
            txtCriador = (TextView) findViewById(R.id.txtCriador);
            btnCalcular = (Button) findViewById(R.id.btnCalcular);

            btnCalcular.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                try{
                    double distanciaValor = Double.parseDouble(editDistancia.getText().toString());
                    double KMLValor = Double.parseDouble(editKmL.getText().toString());
                    double precoC = Double.parseDouble(editValorC.getText().toString());

                    if (distanciaValor == 0 || KMLValor == 0 || precoC == 0) {
                        Toast.makeText(view.getContext(),
                                "Os valores não podem ser 0. Por favor, insira números válidos.",
                                Toast.LENGTH_SHORT).show();
                        return;
                    }

                    double CNecessario = distanciaValor / KMLValor;
                    double CViagem = CNecessario * precoC;

                    txtR1.setText(String.valueOf(CNecessario + " L"));
                    txtR2.setText(String.valueOf(CViagem + " R$"));

                } catch (NumberFormatException e) {
                    Toast.makeText(view.getContext(),
                            "Por favor, preencha ambos os campos com " +
                                    "números válidos", Toast.LENGTH_SHORT).show();
                }
                }
            });
        }
    }

