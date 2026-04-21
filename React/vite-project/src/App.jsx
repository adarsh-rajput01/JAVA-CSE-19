import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import heroImg from './assets/hero.png'
import './App.css'
import Card from './assets/components/Card'


function App() {
  const [count, setCount] = useState(0)

  return (
    <div>
     <Card
     name="Rahul"
     class="10 class"/>

     <br />
     <Card
     img="https://cdn.dribbble.com/userupload/42146485/file/original-dc43f095911edae513cc37b2cef576e0.png"
     name="Jay"
     class="B.TEch"/>
     
     <br />
     <Card
     name="Raman"
     class="Doctor"/>
     

    </div>
  )
}
export default App