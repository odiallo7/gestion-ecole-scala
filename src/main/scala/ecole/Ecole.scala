package ecole

class Professeur(var _idProfesseur: String, var _nomProfesseur: String, var _prenomPro: String, var _grade: String){
  def idProfesseur = _idProfesseur
  def nomProfesseur = _nomProfesseur
  def prenomPro = _prenomPro
  def grade = _grade

  def idProfesseur_= (newValue:String)= _idProfesseur = newValue
  def nomPro_= (newValue: String) = _prenomPro = newValue
  def prenomPro_= (newValue: String) = _prenomPro = newValue
  def grade_= (newValue: String) = _grade = newValue
}
class  Etudiant(var _idEtudiant: String, var _nomEtudiant: String, var _prenomEtudiant: String, var _niveauEtude: String){
  def idEtudiant = _idEtudiant
  def nomEtudiant = _nomEtudiant
  def prenomEtudiant = _prenomEtudiant
  def niveauEtude = _niveauEtude

  def idEtudiant_= (newValue: String)= _idEtudiant = newValue
  def nomEtudiant_= (newValue: String) = _nomEtudiant = newValue
  def prenomEtudiant_= (newValue: String) = _prenomEtudiant = newValue
  def niveauEtude_= (newValue: String) = _niveauEtude = newValue

}

class Salle(var _numeroSalle: Int, var _libelleSalle: String){
  def numeroSalle = _numeroSalle
  def libelleSalle = _libelleSalle

  def numeroSalle_= (newValue: Int) = _numeroSalle = newValue
  def libelleSalle_= (newValue: String) = _libelleSalle = newValue
}
class  Matiere(var _codeMatiere: String, var _libelleMatiere: String, var _coeffMatiere: Int){
  // Getters and Setters
  def codeMatiere = _codeMatiere
  def libelleMatiere = _libelleMatiere
  def coeffMatiere = _coeffMatiere

  def codeMatiere_=  (newValue: String) = _codeMatiere = newValue
  def libelleMatiere_= (newValue: String) = _libelleMatiere = newValue
  def coeffMatiere_= (newValue: Int) = _coeffMatiere = newValue

  override def toString: String = s"Code: $codeMatiere, Libellé: ${libelleMatiere}, Coéficient: ${coeffMatiere}"
}

object Ecole {
  def main(args: Array[String]): Unit =
  {
    // Instanciation des entités
    val matiere: Matiere = new Matiere("M001", "Math", 2)
    val salle: Salle = new Salle(1, "Salle A1")
    val etudiant: Etudiant = new Etudiant("P1_11", "Diallo", "Ousmane", "Master")
    val prof: Professeur = new Professeur("Pro_123", "Mboup", "Djibril", "PhD")

    println("Bienvenu à l'école")
    // Affichage des objets
    println(s"Professeur: ${prof.idProfesseur}, ${prof.prenomPro} ${prof.nomProfesseur} ${prof.grade}")
    println(s"Etudiant: ${etudiant.idEtudiant}, ${etudiant.nomEtudiant} ${etudiant.prenomEtudiant} ${etudiant.niveauEtude}")
    println(s"Salle: ${salle.numeroSalle}, ${salle.libelleSalle}")
    println(s"Matiere: ${matiere.codeMatiere} ${matiere.libelleMatiere} ${matiere.coeffMatiere}")

    // Modification
    matiere.coeffMatiere = 4
    prof.prenomPro = "Cheikh Djibril"
    prof.idProfesseur = "Teacher007"
    etudiant.niveauEtude = "Master II"
    salle.libelleSalle = "Union Africaine"

    //Réaffiche das modifications
    println(s"Professeur: ${prof.idProfesseur}, ${prof.prenomPro} ${prof.nomProfesseur} ${prof.grade}")
    println(s"Etudiant: ${etudiant.idEtudiant}, ${etudiant.nomEtudiant} ${etudiant.prenomEtudiant} ${etudiant.niveauEtude}")
    println(s"Salle: ${salle.numeroSalle}, ${salle.libelleSalle}")
    println(s"Matiere: ${matiere.codeMatiere} ${matiere.libelleMatiere} ${matiere.coeffMatiere}")

  }
}