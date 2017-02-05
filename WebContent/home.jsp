<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="js/jquery-2.2.0.min.js"></script>

</head>
<body>

<!--  <h3>Enter Number of archers:</h3><input type="text" name="noOfArchersTextBox" id="noOfArchersTextBox">
  
 <button type="submit" class="btn btn-primary btn-lg" id="noOfArchers" name="noOfArchers">Go</button>
 
 <div style="display:none" id="archersAndRank">
  				   <table id="resultTable" >
  				   	<thead>
  				   		<tr>
  				   			<td>Archer</td><td>Rank</td>
  				   		</tr>
  				   	</thead>
  				   	<tbody>
  				   		<tr><td>1</td><td><input type="text" name="archerName1" placeholder="text goes here..."></td> <td><input type="text" name="archerName1Rank" placeholder="text goes here..."></td></tr>
  				   		<tr><td> <input type="text" name="archerName2"></td> <td><input type="text" name="archerName2Rank"></td></tr>
  				   		<tr><td><input type="text" name="archerName3"></td><td><input type="text" name="archerName3Rank"></td></tr>
  				   		<tr><td> <input type="text" name="archerName4"></td> <td><input type="text" name="archerName4Rank"></td></tr>
  				   	</tbody>
  				   	  <tr>
            <td>1</td>
            <td><input type="name" placeholder="text goes here..."></td>
            <td><input type="name" placeholder="text goes here..."></td>
          </tr>
  	    </table>
  	    <button type="submit" class="btn btn-primary btn-lg" id="predict" name="predict">Predict</button>
 
  	</div> -->
  	


<form action="Prediction" method="get">

<table id="resultTable">
  				   	<thead>
  				   		<tr>
  				   			<td>Archer</td><td>Rank</td>
  				   		</tr>
  				   	</thead>
  				   	<tbody>
  				   		<tr><td><input type="text" name="archerName1" placeholder="text goes here..."/></td> <td><input type="text" name="archerName1Rank" placeholder="text goes here..."/></td></tr>
  				   		<tr><td> <input type="text" name="archerName2"/></td> <td><input type="text" name="archerName2Rank"/></td></tr>
  				   		<tr><td><input type="text" name="archerName3"/></td><td><input type="text" name="archerName3Rank"/></td></tr>
  				   		<tr><td> <input type="text" name="archerName4"/></td> <td><input type="text" name="archerName4Rank"/></td></tr>
  				   	</tbody>
 </table>
 <h1> Olympic Round Format</h1>
  <input type="radio" name="competitionFormat" value="oneOneTwentyEight"> 1/128<br>
  <input type="radio" name="competitionFormat" value="oneSixtyFour"> 1/64<br>
  <input type="radio" name="competitionFormat" value="oneThirtyTwo"> 1/32<br>
  <input type="radio" name="competitionFormat" value="oneSixteen"> 1/16 <br>
  <br> 
  <input type="submit" value="submit">
</form>
</body>
<script src="js/showHideScripts.js" type="text/javascript" ></script>
</html>