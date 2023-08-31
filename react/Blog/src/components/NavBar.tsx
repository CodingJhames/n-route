
import styled from 'styled-components';
import BurguerBtn from './BurguerBtn';


export const NavBar = () => {
  return (
    <>
        <NavContainer>
            <h2>NavBar <span>Responsive</span></h2>
            <div>
                <a href="/">Home</a>
                <a href="/">Shop</a>
                <a href="/">About</a>
                <a href="/">Contact</a>
                <a href="/">Blog</a>
            </div>
            <div className='burguer' >
                <BurguerBtn />
            </div>
        </NavContainer>
    </>
  )
}

const NavContainer = styled.nav`
    h2{ 
        color: white;
        font-weight: 400;
        span{
            font-weight: bold;
        }
    }
    padding: .4rem;
    background-color: #333;
    display: flex;
    align-items: center;
    justify-content: space-between;
    a{
        color: white;
        text-decoration: none;
        margin-right: 1rem;
    }
    .burguer{
        @media( min-width: 768px ){
            display: none;
        }
    }

`
