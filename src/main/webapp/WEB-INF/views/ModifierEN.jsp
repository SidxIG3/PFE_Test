<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="fr">

<head>

	<!-- description de la page  -->
		<meta charset="utf-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
		<meta name="description" content="" /> 
		<meta name="author" content="" />
		<title>Notre Formulaire</title>
		
	<!-- links de template -->
		<!-- Custom fonts for this template-->
		<link href="/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
		<link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

		<!-- Custom styles for this template-->
		<link href="/css/sb-admin-2.min.css" rel="stylesheet">

	<!-- links de la page -->
		<link href="/images/icons64.ico" rel="shortcut icon" />		
		<link href="/css/styleGenerale.css" rel="stylesheet" />
        

</head>

<body id="page-top">

  <!-- Page Wrapper -->
  <div id="wrapper">

    <!-- Sidebar -->
    <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

      <!-- Sidebar - Brand -->
      <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.html">
       
        <div class="sidebar-brand-text mx-3">ComptaLog</sup></div>
      </a>

      <!-- Divider -->
      <hr class="sidebar-divider my-0">

      <!-- Nav Item - Dashboard -->
      <li class="nav-item active">
        <a class="nav-link" href="index.html">
          <i class="fas fa-fw fa-tachometer-alt"></i>
          <span>Dashboard</span></a>
      </li>

      <!-- Divider -->
      <hr class="sidebar-divider">

      <!-- Heading -->
      <div class="sidebar-heading">
        Interface
      </div>

	
	
	  
	  <li class="nav-item">
        <a class="nav-link " href="form1.html" >
          <i class="fas fa-fw fa-cog"></i>
          <span>Ajouter Eleve</span>
        </a>
       
      </li>
	  
	  
      <!-- Nav Item - Pages Collapse Menu -->
      <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="true" aria-controls="collapseTwo">
          <i class="fas fa-fw fa-cog"></i>
          <span>Components</span>
        </a>
        <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
          <div class="bg-white py-2 collapse-inner rounded">
            <h6 class="collapse-header">Custom Components:</h6>
            <a class="collapse-item" href="/buttons.html">Buttons</a>
            <a class="collapse-item" href="/cards.html">Cards</a>
          </div>
        </div>
      </li>

      <!-- Nav Item - Utilities Collapse Menu -->
      <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities" aria-expanded="true" aria-controls="collapseUtilities">
          <i class="fas fa-fw fa-wrench"></i>
          <span>Utilities</span>
        </a>
        <div id="collapseUtilities" class="collapse" aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
          <div class="bg-white py-2 collapse-inner rounded">
            <h6 class="collapse-header">Custom Utilities:</h6>
            <a class="collapse-item" href="/utilities-color.html">Colors</a>
            <a class="collapse-item" href="/utilities-border.html">Borders</a>
            <a class="collapse-item" href="/utilities-animation.html">Animations</a>
            <a class="collapse-item" href="/utilities-other.html">Other</a>
          </div>
        </div>
      </li>

      <!-- Divider -->
      <hr class="sidebar-divider">
	


      <!-- Divider -->
      <hr class="sidebar-divider d-none d-md-block">

      <!-- Sidebar Toggler (Sidebar) -->
      <div class="text-center d-none d-md-inline">
        <button class="rounded-circle border-0" id="sidebarToggle"></button>
      </div>

    </ul>
    <!-- End of Sidebar -->

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

      <!-- Main Content -->
      <div id="content">

        <!-- Topbar -->
        <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

          <!-- Sidebar Toggle (Topbar) -->
          <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
            <i class="fa fa-bars"></i>
          </button>



          <!-- Topbar Navbar -->
          <ul class="navbar-nav ml-auto">

            <!-- Nav Item - Search Dropdown (Visible Only XS) -->
            <li class="nav-item dropdown no-arrow d-sm-none">
              <a class="nav-link dropdown-toggle" href="#" id="searchDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <i class="fas fa-search fa-fw"></i>
              </a>
       
            </li>


            <div class="topbar-divider d-none d-sm-block"></div>

            <!-- Nav Item - User Information -->
            <li class="nav-item dropdown no-arrow">
              <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <span class="mr-2 d-none d-lg-inline text-gray-600 small">Valerie Luna</span>
                <img class="img-profile rounded-circle" src="https://source.unsplash.com/QAB-WJcbgJk/60x60">
              </a>
              <!-- Dropdown - User Information -->
              <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in" aria-labelledby="userDropdown">
                <a class="dropdown-item" href="#">
                  <i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i>
                  Profile
                </a>
                <a class="dropdown-item" href="#">
                  <i class="fas fa-cogs fa-sm fa-fw mr-2 text-gray-400"></i>
                  Settings
                </a>
                <a class="dropdown-item" href="#">
                  <i class="fas fa-list fa-sm fa-fw mr-2 text-gray-400"></i>
                  Activity Log
                </a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#" data-toggle="modal" data-target="#logoutModal">
                  <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                  Logout
                </a>
              </div>
            </li>

          </ul>

        </nav>
        <!-- ici  -->
		
		<!-- details de la page  -->
				<div id="layoutAuthentication">
            <div id="layoutAuthentication_content">
                <main>
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-lg-5">
                            	
                                <div class="card shadow-lg border-0 rounded-lg mt-5">
                                	
                                    <div class="card-header"><h4 class="text-center font-weight-light my-4" style="font-size: 2rem; font-family: Segoe UI;">Modofier les informations de l'Enterprise</h4></div>
                                    <div class="card-body">
                                    	
                                   
                                    	
                                        <form:form  modelAttribute="informations_entreprise"  action="/enregistrerEN" method="POST">
                                        <div class="form-group">
												
												<form:input  path="id" class="form-control py-4 form-control-user" id="inputAddress" type="hidden" required="required"  style="font-size: 1rem; font-family: Segoe UI;" />
											</div>
                                        <div class="form-group">
												<label class="small mb-1" for="inputEmailAddress" style="font-size: 1rem; font-family: Segoe UI;">Adresse</label>
												<form:input  path="adresse" class="form-control py-4 form-control-user" id="inputAddress" type="text" required="required" placeholder="Votre Adresse" style="font-size: 1rem; font-family: Segoe UI;" />
											</div>
											<div class="form-group">
												<label class="small mb-1" for="inputEmailAddress" style="font-size: 1rem; font-family: Segoe UI;">Adresse Banque</label>
												<form:input  path="adresse_banque" class="form-control py-4 form-control-user" id="inputABanque" type="text" required="required" placeholder="Saisir votre Adresse Banque" style="font-size: 1rem; font-family: Segoe UI;" />
											</div>
											<div class="form-group">
												<label class="small mb-1" for="inputEmailAddress" style="font-size: 1rem; font-family: Segoe UI;">Capital</label>
												<form:input  path="capital" class="form-control py-4 form-control-user" id="inputcap" type="int" required="required" placeholder="Votre Capital" style="font-size: 1rem; font-family: Segoe UI;" />
											</div>
											<div class="form-group">
												<label class="small mb-1" for="inputEmailAddress" style="font-size: 1rem; font-family: Segoe UI;">Cle rib</label>
												<form:input  path="cle_rib" class="form-control py-4 form-control-user" id="inputCrib" type="int" required="required" placeholder="Cle rib" style="font-size: 1rem; font-family: Segoe UI;" />
											</div>
                                             
                                             		<div class="form-group">
												<label class="small mb-1" for="inputEmailAddress" style="font-size: 1rem; font-family: Segoe UI;">Code Banque</label>
												<form:input  path="code_banque" class="form-control py-4 form-control-user" id="inputCBanque" type="text" required="required" placeholder="Saisir votre Code banque" style="font-size: 1rem; font-family: Segoe UI;" />
											</div>
											<div class="form-group">
												<label class="small mb-1" for="inputEmailAddress" style="font-size: 1rem; font-family: Segoe UI;">Code guichet</label>
												<form:input  path="code_guichet" class="form-control py-4 form-control-user" id="inputCG" type="text" required="required" placeholder="Saisir votre Code guichet" style="font-size: 1rem; font-family: Segoe UI;" />
											</div>
											<div class="form-group">
												<label class="small mb-1" for="inputEmailAddress" style="font-size: 1rem; font-family: Segoe UI;">Device principale</label>
												<form:input path="devise_principale" class="form-control py-4 form-control-user" id="inputDevice" type="text" required="required" placeholder="Votre Device principale" style="font-size: 1rem; font-family: Segoe UI;" />
											</div>
											 <div class="form-group">
												<label class="small mb-1" for="inputEmailAddress" style="font-size: 1rem; font-family: Segoe UI;">Email</label>
												<form:input  path="email" class="form-control py-4 form-control-user" id="inputEmailAddress" type="email" required="required" placeholder="Saisir votre Email" style="font-size: 1rem; font-family: Segoe UI;" />
											</div>
											 <div class="form-group">
												<label class="small mb-1" for="inputPassword" style="font-size: 1rem; font-family: Segoe UI;">fax</label>
												<form:input  path="fax" class="form-control py-4 form-control-user" id="inputFax" type="tel" required="required" placeholder="Saisir le numero de fax" style="font-size: 1rem; font-family: Segoe UI;" />                                        
                                            </div>
                                            <div class="form-group">
									 			<label class="small mb-1" for="inputEmailAddress" style="font-size: 1rem; font-family: Segoe UI;">logo</label>
												<form:input  path="site_web" class="form-control py-4 form-control-user" id="inputLogo" type="file" required="required" placeholder="votre logo" style="font-size: 1rem; font-family: Segoe UI;" />
											</div>
											
											<div class="form-group">
												<label class="small mb-1" for="inputEmailAddress" style="font-size: 1rem; font-family: Segoe UI;">Nom Banque</label>
												<form:input  path="nom_banque" class="form-control py-4 form-control-user" id="inputNBanque" type="text" required="required" placeholder="Saisir votre Nom Banque" style="font-size: 1rem; font-family: Segoe UI;" />
											</div>
											<div class="form-group">
												<label class="small mb-1" for="inputEmailAddress" style="font-size: 1rem; font-family: Segoe UI;">Numero de Compte Bancaire</label>
												<form:input  path="numero_compte_bancaire" class="form-control py-4 form-control-user" id="inputCompB" type="int" required="required" placeholder="Saisir votre Compte Bancaire" style="font-size: 1rem; font-family: Segoe UI;" />
											</div>
											
											<div class="form-group">
												<label class="small mb-1" for="inputEmailAddress" style="font-size: 1rem; font-family: Segoe UI;">Raison sociale</label>
												<form:input  path="raison_sociale" class="form-control py-4 form-control-user" id="inputRsocial" type="text" required="required" placeholder="Saisir votre Raison sociale" style="font-size: 1rem; font-family: Segoe UI;" />
											</div>
												<div class="form-group">
												<label class="small mb-1" for="inputEmailAddress" style="font-size: 1rem; font-family: Segoe UI;">Site web</label>
												<form:input  path="logo" class="form-control py-4 form-control-user" id="inputSite" type="url" required="required" placeholder="Saisir votre Site web" style="font-size: 1rem; font-family: Segoe UI;" />
											</div>
                                           
                                            <div class="form-group">
												<label class="small mb-1" for="inputEmailAddress" style="font-size: 1rem; font-family: Segoe UI;">Telephone</label>
												<form:input  path="telephone" class="form-control py-4 form-control-user" id="inputtelephone" type="int" required="required" placeholder="Saisir votre numero de telephone" style="font-size: 1rem; font-family: Segoe UI;" />
											</div>		
										
											
											<div class="form-group">
												<label class="small mb-1" for="inputEmailAddress" style="font-size: 1rem; font-family: Segoe UI;">Type d'activite</label>
												<form:input  path="type_activite" class="form-control py-4 form-control-user" id="inputAc" type="text" required="required" placeholder="Votre Type d'activite" style="font-size: 1rem; font-family: Segoe UI;" />
											</div>
											
											 <div class="form-group">
												<label class="small mb-1" for="inputPassword" style="font-size: 1rem; font-family: Segoe UI;">Ville</label>
												<form:input  path="ville" class="form-control py-4 form-control-user" id="inputVille" type="text" required="required" placeholder="Votre Ville" style="font-size: 1rem; font-family: Segoe UI;" />                                        
                                            </div>
											
                                            <div class="form-group d-flex align-items-center justify-content-between mt-4 mb-0">
											
												<input type="submit" class="btn btn-outline-primary" name="" value="Enregistrer" style="border-radius: 10rem; width: 300px; height: 45px;">
												<input type="Reset" class="btn btn-outline-warning" name="" value="Rénitialiser" style="border-radius: 10rem; width: 300px; height: 45px;">
											</div>
											
                                        </form:form>
                                    </div>
                                    <div class="card-footer text-center">
                                       
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </main>
            </div>
          
        </div>
		
		
		
		
		
      <!-- End of Main Content -->

     
      <!-- End of Footer -->

    </div>
    <!-- End of Content Wrapper -->

  </div>
  <!-- End of Page Wrapper -->

  <!-- Scroll to Top Button-->
  <a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
  </a>

  <!-- Logout Modal-->
  <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
          <button class="close" type="button" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">×</span>
          </button>
        </div>
        <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
        <div class="modal-footer">
          <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
          <a class="btn btn-primary" href="login.html">Logout</a>
        </div>
      </div>
    </div>
  </div>
	<!-- Script de template -->
		<!-- Bootstrap core JavaScript-->
		<script src="vendor/jquery/jquery.min.js"></script>
		<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

		<!-- Core plugin JavaScript-->
		<script src="vendor/jquery-easing/jquery.easing.min.js"></script>

		<!-- Custom scripts for all pages-->
		<script src="js/sb-admin-2.min.js"></script>

		<!-- Page level plugins -->
		<script src="vendor/chart.js/Chart.min.js"></script>

		<!-- Page level custom scripts -->
		<script src="js/demo/chart-area-demo.js"></script>
		<script src="js/demo/chart-pie-demo.js"></script>
		
		
	<!-- scripts de la page -->
		<script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/js/all.min.js" crossorigin="anonymous"></script>
		<script src="https://code.jquery.com/jquery-3.4.1.min.js" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="js/scripts.js"></script>


</body>

</html>
