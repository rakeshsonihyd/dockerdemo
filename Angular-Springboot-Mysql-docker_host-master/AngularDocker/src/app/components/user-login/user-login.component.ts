import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserLogin } from 'src/app/commons/user-login';
import { UserLoginService } from 'src/app/service/user-login.service';

@Component({
  selector: 'app-user-login',
  templateUrl: './user-login.component.html',
  styleUrls: ['./user-login.component.css']
})
export class UserLoginComponent implements OnInit {
  inputName = "";
  inputPassword = "";
  userlogin:UserLogin[];
  constructor(private userLoginService: UserLoginService,public router: Router) { }

  ngOnInit(): void {
  }
  checkLogin(){
   console.log("Username entered by User "+this.inputName);
   console.log("Password entered by user "+this.inputPassword);
    this.userLoginService.userInformation().subscribe(data => {
      console.log(data);
      this.userlogin= data;
      console.log("....From the Database userlogin details...."+this.userlogin);
    }, error => console.log(error));

    const user = this.userlogin.find(
      (x) => x.userName === this.inputName && x.password === this.inputPassword
    )
    
    if(user){
      console.log('Valid');
      alert('Congratulation, You login successfully');
    }else{
      alert('Sorry, check Your credentials');
    }

  }

}
