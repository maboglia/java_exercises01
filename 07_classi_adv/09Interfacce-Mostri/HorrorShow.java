
class HorrorShow {
static void canCheAbbaia(Monster b) {
b.menace();
System.out.println("---------------------");
}
static void terminator(DangerousMonster d) {
d.menace();
d.destroy();
System.out.println("---------------------");
}
static void vampirator(Vampire v) {
v.menace();
v.drinkBlood();
v.kill();
System.out.println("---------------------");
}



public static void main(String[] args) {
DragonZilla drago = new DragonZilla();
Transilvan dracula = new Transilvan();
Vampire nosferatu = new Transilvan();
canCheAbbaia(drago);
canCheAbbaia(dracula);
terminator(nosferatu);
terminator(drago);
// vampirator(drago);
vampirator(dracula);
vampirator(nosferatu);
}
}