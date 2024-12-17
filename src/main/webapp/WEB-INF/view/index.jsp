<html lang="en" id="html" class=" js flexbox canvas canvastext webgl no-touch geolocation postmessage no-websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers no-applicationcache no-svg no-inlinesvg no-smil no-svgclippaths" style=""><head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8">
    <meta name="description" content="Entab">
    <title>School ERP Software</title>
    <link rel="shortcut icon" href="/img/sanskarLogo.png" type="image/x-icon">
   <script src="${pageContext.request.contextPath}/bootstrap.min.js"></script> 
   <script src="${pageContext.request.contextPath}/jquery-1.11.2.min.js"></script> 
   <script src="${pageContext.request.contextPath}/jqueryfileJs.js"></script> 
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/fontsgoogleapis.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/Indexstyle.css">
    

    <script type="text/javascript">
        $(function () {
            (function blink() {
                $('.blink_me').fadeOut(500).fadeIn(500, blink);
            })();
        });
    </script>
    
    <script type="text/javascript">
    // You can also use "$(window).load(function() {"
        $(function (event) {
            $("#splnk").hide();
            //document.getElementById('hrppopup').click();
        // onclickproceed();
        });

        function onclickproceed(pagePath) {
            document.close();
            document.cookie = "chk=enable";
            //location.href = "/logon/logon";
            if (readcookie("chk") != null) {
                document.cookie = "";
                var windowHeight = 1500;
                var windowWidth = 1500;

                var topPosition = (screen.height - windowHeight) / 2;
                var leftPosition = (screen.width - windowWidth) / 2;

                var param = 'addressbar=0,location=0,fullscreen=yes,resizable=yes,scrollbars=yes,toolbar=no,directories=no,status=no,menubar=no,copyhistory=no,height=' + windowHeight + ',width=' + windowWidth + ',top=' + topPosition + ',left=' + leftPosition;
                if (window.name != '' && window.name == 'Active') {
                    window.close();
                    location.href = '/';
                }
                var newwindwo = window.open(pagePath, 'Active', param, true);

                if (!newwindwo) {
                    $("#splnk").show();
                    alert("Please Allow Pop-ups of your Browser for the Application/Software to Run on Your Browser.");

                    addEventListener("click", function () {
                        var el = document.documentElement,
                        rfs = el.requestFullscreen || el.webkitRequestFullScreen || el.mozRequestFullScreen || el.msRequestFullscreen;

                        if (typeof rfs != "undefined" && rfs) {
                            rfs.call(el);
                        }
                        else if (typeof window.ActiveXObject != "undefined") {
                            var wscript = new ActiveXObject("WScript.Shell");
                            if (wscript != null) {
                                wscript.SendKey("{F11}");
                                $("#hrppopup").click();
                            }
                        }
                    });
                }

            }
            else {
                alert("Browser cookies is disable. Go to your browser settings and enable cookies.")
                return false;
            }
        }
    </script>

</head>


<body style="">
    <div class="container">
        <div class="row">
            <div class="col-xs-12 col-sm-12 col-md-12">
                <a>
                    <div class="top-space">
                        <div class="logo-img">
                            <div class="circle-Mask">
                                <img src="/img/sanskarLogo.png" class="img-responsive circle-logo center-block">
                            </div>

                          
                        </div>
                        <div class="logo-titile">
                            <h3 class="ltitile">Sanskar Dnyanpeeth School & Junior College Of Science</h3>
                            <h4 class="logo-tagline">Samudrapur, 442305</h4>
                        </div>
                    </div>
                </a>
            </div>
        </div>
    </div>
    <div class="heighthide"></div>

    <!-- About Modal -->
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-12 blue-bg"> </div>
            <div class="col-md-12 yellow-bg"> </div>
            <div class="container">
                <div class="col-lg-12 sectionmargin">
                    <div class="col-lg-5  col-md-5  col-sm-6  col-xs-12">

                        <div class="col-md-12 about-grid">
                            <div class="height-100"></div>
                            <h1 class="big-heading">MrunalSoft<sup></sup></h1>
                            <h3 class="small-heading">An ERP for Schools</h3>
                        </div>

                        <div class="col-md-12 about-grid">
                            <div class="clr"></div>
                            <div class="row">
	                            <div class="col-md-3">
	                              <button type="button" class="ppbtn" onclick="return onclickproceed('adminLogin');">Admin <br> Login</button>
	                            </div>
	                            <div class="col-md-3">
	                              <button type="button" class="ppbtn" onclick="return onclickproceed();">Techer <br> Login</button>
	                            </div>
	                            <div class="col-md-3">
	                              <button type="button" class="ppbtn" onclick="return onclickproceed();">Clerk <br> Login</button>
	                            </div>
                            </div>
                            
                            
                            
                            <!-- <a href="http://www.irainternationalschool.ac.in" target="_blank">  <button type="button" class="loginbtn">School Website</button></a> -->
                        </div>
                        
                        <div class="clr"></div>

                        <div class="col-md-12 about-grid">
                            <p class="email-link"><strong><span class="white">Support Team :</span> </strong><a href="mrunallohakare@gmail.com">mrunallohakare@gmail.com</a></p>
                            <p class="email-link"><strong><span class="white">Parent Desk :</span> </strong><a href="mailto:parent@entab.info">parent@entab.info</a></p>
                        </div>
                    </div>

                    <div class="col-lg-7 col-md-7 col-sm-6 hidden-xs text-right phone"> <img src="/img/mobile--animation.gif" class="img-responsive center-block width90"> </div>
                </div>
            </div>
        </div>
    </div>

    <!-- About Modal -->
    <div id="about" class="modal fade" role="dialog">
        <div class="modal-dialog modal-lg">
            <!-- Modal content-->
            <div class="modal-content">
                <div class="modal-header modal-header-bg">
                    <button type="button" class="close" data-dismiss="modal">×</button>
                    <h3 class="modal-title">About Us</h3>
                </div>
                <div class="modal-body" style="max-height: 500px; overflow: scroll; overflow-x: hidden;">
                    <div class="col-xs-12 col-sm-12 col-md-12">
                        <h5><a href="https://www.entab.in" target="_blank" style="color: #039857;font-weight:100">
    Entab –<span style="color: #039857;"> CampusSoft® : </span></a>The administration simplified the electronic way. <span style="color: #039857;">Entab Infotech Pvt Ltd,</span> is an Information Technology company specialized in providing integrated <span style="color: #039857;"><a href="https://www.entab.in" target="_blank" style="color: #039857;font-weight:100">
    software solutions /ERP to Schools</a>, Colleges. “CampusSoft®”
</span>is the flagship application software that is automating and sophisticating the administration, academic, finance and communication to home. With a clientele of more than <span style="color: #039857;">1300 successful institutionsspread across 26 states in India and 06 countries in Middle East, Africa etc.</span>
</h5>
                        <h5> The CampusCare is evolved out of many years (since 2000) of continues development based on the association with schools. It reflects the knowledge and experience that we have accumulated since 2000 in this domain and today we are delivering the best <span style="color: #039857;">campus management software /ERP </span>available in the country with more than 95% success rate. Salient features of CampusCare- The powerful, integrated and easy to use tool for any educational institutions.</h5>
                        <p>
                            ∗ Entab – CampusCare serving the schools since 2000.<br>
                            ∗ Highest rate of retention : Clients and technical hands.<br>
                            ∗ There is no successful replacement of CampusCare software in the country.<br>
                            ∗ Experienced software tech consultants for guidance and implementation. <br>
                            ∗ Higher level of automation and sophistication ensuring higher level of accountability.<br>
                            ∗ State of the art parental engagement tool for communication to parents, students and staff.<br>
                            ∗ CampusCare improves the school productivity, accountability, reputation and saves valuable time &amp; money.<br>
                            ∗ Seamlessly integrated with all modules and payment gateway for fee collection.<br>
                            ∗ Providing technical consultancy and software solution for examination projects of educational boards in the country and abroad. <br>
                            ∗ Ensures limited customization to assure your schools functionality is achieved and successful.<br>
                            ∗ Efficient and effective online services and support on all days, except Sundays (Mondays to Saturdays).<br>
                            ∗ ‘Pay as you grow’ or ‘Pay as you go’ are the model of our business giving no major upfront charges.<br>
                        </p>
                        <div class="row side">
                            <div class="col-md-4"> <img src="/images/entab.png" class="img-responsive"> </div>
                            <div class="col-md-8">
                                <h5><b>Address:</b> B-227, Okhla Industrial Area Phase-1, New Delhi-110020.</h5>
                                <h5><b>Phone:</b> +91-11-43193333(100 Lines) <b style="margin-left: 5%;"> Fax:</b> +91-11-43193340</h5>
                                <h5 class="email"><b>Email id:</b> <a href="mailto:support@entab.info"> support@entab.info </a> <b style="margin-left: 15%;"> Website:</b> <a href="https://www.entab.in" target="_blank" style="color: #055d37"> www.entab.in</a></h5>
                                <span style="color: #ce2a05; float: left;">Copyright © 2018 Entab Infotech Pvt. Ltd.</span>
                            </div>
                        </div>
                        <hr>
                        <div class="col-xs-12 col-sm-12 col-md-12">
                            <h5 style="color: #10925b"><b>BY INSTALLING CAMPUSSOFT YOU HAVE AGREED TO THE TERMS OF THIS AGREEMENT.</b></h5>
                            <p>
                                License to Use. Entab grants to you a non-exclusive and non-transferable license for the internal use only of the accompanying software and documentation and any error corrections provided by Entab (collectively "Software"). You have no right to distribute the Software any one including your sister concern or branches inside or outside the country. Restrictions. Software is confidential and copyrighted. Title to Software and all associated intellectual property rights is retained by Entab and/or its licensors. You may make copies of Software only for your internal use provided that you reproduce all notices in and on Software, including this Agreement. Unless enforcement is prohibited by applicable law, you may not modify, decompile, disassemble, or otherwise reverse engineer Software. You acknowledge that the Software is not designed or intended for use in on-line control of aircraft, air traffic, aircraft navigation or aircraft communications; or in the design, construction, operation or maintenance of any nuclear facility. Entab disclaims any express or implied warranty of fitness for such uses. No right, title or interest in or to any trademark, service mark, logo, or trade name of Entab or its licensors is granted under this Agreement. Limited Warranty. Entab warrants to you that for a period of ninety (90) days from the date of purchase (If otherwise not specified), as evidenced by a copy of the receipt, the media on which Software is furnished (if any) will be free of defects in materials and workmanship under normal use. Except for the foregoing, Software is provided "AS IS". Your exclusive remedy and Entab's entire liability under this limited warranty will be at Entab's option to replace the Software media or refund the fee paid for the Software. Customisation and visits if any and done that part will be deducted while refund. Disclaimer of Warranty. <br>
                                UNLESS SPECIFIED IN THIS AGREEMENT, ALL EXPRESS OR IMPLIED CONDITIONS, REPRESENTATIONS AND WARRANTIES, INCLUDING ANY IMPLIED WARRANTY OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR NON-INFRINGEMENT, ARE DISCLAIMED, EXCEPT TO THE EXTENT THAT THESE DISCLAIMERS ARE HELD TO BE LEGALLY INVALID.Customisation and visits if any and done that part will be deducted while refund. Limitation of Liability. TO THE EXTENT NOT PROHIBITED BY APPLICABLE LAW, IN NO EVENT WILL ENTAB OR ITS LICENSORS BE LIABLE FOR ANY LOST REVENUE, PROFIT OR DATA, OR FOR SPECIAL, INDIRECT, CONSEQUENTIAL, INCIDENTAL OR PUNITIVE DAMAGES, HOWEVER CAUSED AND REGARDLESS OF THE THEORY OF LIABILITY, ARISING OUT OF OR RELATED TO THE USE OF OR INABILITY TO USE SOFTWARE, EVEN IF ENTAB HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES. In no event will Entab's liability of you, whether in contract, tort (including negligence), or otherwise, exceed the amount paid by you for Software under this Agreement. The foregoing limitations will apply even if the above stated warranty fails of its essential purpose. Customisation and visits if any, and done that part will be deducted while refund. Termination. This Agreement is effective until terminated. You may terminate this Agreement at any time by destroying all copies of Software. This Agreement will terminate immediately without notice from Entab if you fail to comply with any provision of this Agreement. Upon termination, you must destroy all copies of Software, further use in any form is also banned. Export Regulations. All Software and technical data delivered under this Agreement are subject to Indian export control laws and may be subject to export or import regulations in other countries. You agree to comply strictly with all such laws and regulations and acknowledge that you have the responsibility to obtain such licenses to export, re-export, or import as may be required after delivery to you. Governing Law. Any action related to this Agreement will be governed by Indian law . No choice of law rules of any jurisdiction will apply. All disputes subject to New Delhi jurisdiction only. Severability. If any provision of this Agreement is held to be unenforceable, this Agreement will remain in effect with the provision omitted, unless omission of the provision would frustrate the intent of the parties, in which case this Agreement will immediately terminate. Integration. This Agreement is the entire agreement between you and Entab relating to its subject matter. It supersedes all prior or contemporaneous oral or written communications, proposals, representations and warranties and prevails over any conflicting or additional terms of any quote, order, acknowledgment, or other communication between the parties relating to its subject matter during the term of this Agreement. No modification of this Agreement will be binding, unless in writing and signed by an authorized representative of each party. <br>
                                <br>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Modal End-->
    <!-- Policy Modal -->
    <div id="policy" class="modal fade" role="dialog">
        <div class="modal-dialog modal-lg">
            <!-- Modal content-->
            <div class="modal-content">
                <div class="modal-header modal-header-bg">
                    <button type="button" class="close" data-dismiss="modal">×</button>
                    <h3 class="modal-title">Privacy Policy</h3>
                </div>
                <div class="modal-body">
                    <div>
                        <p>Use of any information at the website(s) is at one's own risk. While every effort is made to secure our network communication, however, school may not always be able to ensure the privacy of online communication and other information of the visitors, unless otherwise specifically provided for. Moreover, any information that one provides using this website(s) may become part of a public record subject to disclosure under the relevant regulations from time to time.</p>
                    </div>
                    <hr>
                    <div class="row">
                        <div class="col-md-4"> <img src="/images/entab.png" class="img-responsive"> </div>
                        <div class="col-md-8">
                            <h5><b>Address:</b> B-227, Okhla Industrial Area Phase-1, New Delhi-110020.</h5>
                            <h5><b>Phone:</b> +91-11-43193333(100 Lines) <b style="margin-left: 5%;"> Fax:</b> +91-11-43193340</h5>
                            <h5 class="email"><b>Email id:</b> <a href="mailto:support@entab.info"> support@entab.info </a> <b style="margin-left: 15%;"> Website:</b> <a href="https://www.entab.in" target="_blank" style="color: #055d37"> www.entab.in</a></h5>
                            <span style="color: #201b3b; float: left; font-weight: 400;">Copyright © 2018 Entab Infotech Pvt. Ltd.</span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Modal End-->
    <!--footer-->
    <footer>
        <div class="container">
            <div class="row">
                <div class="col-sm-6 col-md-6 col-xs-6 footer-grid">
                    <p class="footelink"><a href="#" data-toggle="modal" data-target="#about" class="footer"> About Us</a> | <a href="#" data-toggle="modal" data-target="#policy" class="footer"> Privacy Policy</a> </p>
                </div>
                <div class="col-sm-6 col-md-6 col-xs-6 footer-grid text-right">
                    <p class="footelink"> <a href="https://www.entab.in/" target="_blank">: Best School ERP</a></p>      </div>
            </div>
        </div>
    </footer>
    <!-- Script Start hear -->
    <script src="/Scripts/jquery-1.11.2.min.js"></script>
    <script src="/Scripts/bootstrap.min.js"></script>
    <script type="text/javascript">
var popUpObj;
function showModalPopUp() {
    debugger;
    var para = "ModalPopUp, toolbar=no,scrollbars=no,location=no,statusbar=no,menubar=no,resizable=0,width=800,height=800,left = 0,top=0";
    //popUpObj = "_blank" //window.open("/Logon/Logon","ModalPopUp","toolbar=no,scrollbars=no,location=no,statusbar=no,menubar=no,resizable=0,width=1200,height=1500,left = 0,top=0");
    popUpObj = window.open("/Logon/Logon", "_blank", para, true);
popUpObj.focus();
return false;
}
    </script>








</body></html>