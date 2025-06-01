package final_immutabilite;


import com.cgi.model.Person;

import java.time.LocalDateTime;

public class ImmuableTest {


    // Change here : uncomment
    void testImmutability(){
        LocalDateTime time = LocalDateTime.now();
        Float amount = 10.0f;
        Person person = new Person("john", 25);

        FinancialTransaction financialTransaction = new FinancialTransaction(time, amount, person);
        // Cas à vérifier : pas possible de réaffecter
        // Si on modifie un des paramètres du constructeur, aucun changement du côté de l'objet "financialTransaction"
        // Pas de setter
        // Final du côté des paramètres de constructeur

    }

    // change here : make this class imumuable
    static class FinancialTransaction {

        private LocalDateTime time;
        private Float amount;
        private Person person;

        public FinancialTransaction(LocalDateTime time, Float amount, Person person) {
            this.amount = amount;
            this.time = time;
            this.person = person;
        }

        public LocalDateTime getTime() {
            return time;
        }

        public void setTime(LocalDateTime time) {
            this.time = time;
        }

        public Float getAmount() {
            return amount;
        }

        public void setAmount(Float amount) {
            this.amount = amount;
        }

        public Person getPerson() {
            return person;
        }

        public void setPerson(Person person) {
            this.person = person;
        }
    }

}
