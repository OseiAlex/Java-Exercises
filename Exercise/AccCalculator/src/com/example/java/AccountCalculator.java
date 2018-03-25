package com.example.java;

    public class AccountCalculator {
        private int initialBalance = 0;
        private int finalBalance = 0;
        private int totalBalance = 0;

        public void setInitialBalance(int initialBalance) {
            this.initialBalance = initialBalance;
        }

        public void setFinalBalance(int finalBalance) {
            this.finalBalance = finalBalance;
        }

        public int getInitialBalance() {
            return initialBalance;
        }

        public int getfinalBalance(){
            return finalBalance;
        }

        public void CalculatorAccount(){
            if (finalBalance > 0){
                totalBalance = initialBalance + finalBalance;
                System.out.println("Your final balance is: " + totalBalance);
                }
                else{
                System.out.println("Final balance can't be zero" );
                }

            }


    }
